package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.internal.measurement.zzpu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
final class zzad extends zzos {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzad(zzpg zzpgVar) {
        super(zzpgVar);
    }

    private final zzy zzc(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzy) this.zzc.get(num);
        }
        zzy zzyVar = new zzy(this, this.zza, null);
        this.zzc.put(num, zzyVar);
        return zzyVar;
    }

    private final boolean zzd(int i, int i2) {
        zzy zzyVar = (zzy) this.zzc.get(Integer.valueOf(i));
        if (zzyVar == null) {
            return false;
        }
        return zzyVar.zzc().get(i2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(2:2|(2:4|(2:6|7)(1:538))(2:539|540))|8|(3:10|11|12)|16|(7:19|20|21|22|23|(14:(7:25|26|27|28|(1:30)(3:512|(1:514)(1:516)|515)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:468|(6:469|470|471|472|473|(1:476)(1:475))|477)|44|(5:297|(11:299|300|301|302|303|(1:(4:305|(1:307)|308|309))(1:451)|312|313|(3:407|(6:410|(2:446|447)(2:414|(8:420|421|(4:424|(2:426|427)(1:429)|428|422)|430|431|(4:434|(3:436|437|438)(1:440)|439|432)|441|442)(4:416|417|418|419))|443|444|419|408)|449)|315|316)(1:467)|317|(11:320|(3:324|(4:327|(5:329|330|(1:332)(1:336)|333|334)(1:337)|335|325)|338)|339|340|(3:344|(4:347|(3:352|353|354)|355|345)|358)|359|(3:361|(6:364|(2:366|(3:368|369|370))(1:373)|371|372|370|362)|374)|375|(3:384|(8:387|(1:389)|390|(1:392)|393|(2:395|396)(1:398)|397|385)|399)|400|318)|406)|46|47|(3:49|(4:52|(3:54|55|(8:57|58|(10:60|61|62|63|64|65|66|67|(3:69|(11:70|71|72|73|74|75|76|(3:78|79|80)(1:133)|81|82|(1:85)(1:84))|86)(3:140|141|142)|87)(1:157)|88|(4:91|(3:109|110|111)(6:93|94|(2:95|(2:97|(1:99)(2:100|101))(2:107|108))|(1:103)|104|105)|106|89)|112|113|114)(1:158))(1:159)|115|50)|160)|(6:162|(3:164|(6:167|(6:169|170|171|172|173|(3:(9:175|176|177|178|179|(3:181|182|183)(1:244)|184|185|(1:188)(1:187))|189|190)(4:251|252|240|190))(1:268)|191|(2:192|(2:194|(3:231|232|233)(8:196|(2:197|(4:199|(4:201|(1:203)(1:227)|204|205)(1:228)|206|(1:1)(2:210|(1:212)(2:213|214)))(2:229|230))|221|(1:223)(1:225)|224|216|217|218))(0))|234|165)|269)|270|(10:273|274|275|276|277|278|280|(3:282|283|284)(1:286)|285|271)|293|294)(2:295|296))|521)|537|36|37|38|39|40|(0)(0)|44|(0)|46|47|(0)|(0)(0)|(5:(0)|(1:526)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0994, code lost:
    
        if (r12 != false) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0875, code lost:
    
        if (r13 != null) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x02e5, code lost:
    
        if (r6 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x01b3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x01b4, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x01b6, code lost:
    
        r18 = "data";
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0224, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0225, code lost:
    
        r17 = r2;
        r18 = "data";
        r19 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x022f, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0222, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x022c, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0168, code lost:
    
        if (r5 == null) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0a45  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a2 A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_LEAVE, TryCatch #14 {all -> 0x01b0, blocks: (B:40:0x019c, B:42:0x01a2, B:468:0x01bc, B:469:0x01c1, B:471:0x01cb, B:472:0x01db, B:473:0x0207, B:486:0x01ea, B:491:0x01fa, B:494:0x0200, B:480:0x0230), top: B:39:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x01bc A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_ENTER, TryCatch #14 {all -> 0x01b0, blocks: (B:40:0x019c, B:42:0x01a2, B:468:0x01bc, B:469:0x01c1, B:471:0x01cb, B:472:0x01db, B:473:0x0207, B:486:0x01ea, B:491:0x01fa, B:494:0x0200, B:480:0x0230), top: B:39:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x06ea  */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzb(String str, List list, List list2, Long l, Long l2, boolean z) {
        int i;
        int i2;
        boolean z2;
        Map map;
        boolean z3;
        String str2;
        String str3;
        Cursor cursor;
        Map map2;
        HashSet hashSet;
        Map map3;
        List list3;
        boolean z4;
        ?? r5;
        Cursor cursor2;
        Map map4;
        HashSet hashSet2;
        Iterator it;
        Iterator it2;
        Map map5;
        String str4;
        ArrayMap arrayMap;
        com.google.android.gms.internal.measurement.zzfn zzfnVar;
        zzic zzicVar;
        Cursor cursor3;
        String str5;
        Cursor cursor4;
        List list4;
        zzz zzzVar;
        Iterator it3;
        zzbc zzbcVar;
        Iterator it4;
        Map map6;
        Iterator it5;
        long j;
        String str6;
        Cursor cursor5;
        Cursor cursor6;
        List list5;
        Cursor cursor7;
        List list6;
        C0875q.d(str);
        C0875q.g(list);
        C0875q.g(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new ArrayMap();
        this.zzd = l;
        this.zze = l2;
        Iterator it6 = list.iterator();
        while (true) {
            i = 0;
            i2 = 1;
            if (!it6.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzhs) it6.next()).zzd())) {
                z2 = true;
                break;
            }
        }
        zzpu.zza();
        zzic zzicVar2 = this.zzu;
        boolean zzp = zzicVar2.zzc().zzp(this.zza, zzfy.zzaF);
        zzpu.zza();
        boolean zzp2 = zzicVar2.zzc().zzp(this.zza, zzfy.zzaE);
        if (z2) {
            zzav zzj = this.zzg.zzj();
            String str7 = this.zza;
            zzj.zzaw();
            zzj.zzg();
            C0875q.d(str7);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                zzj.zze().update("events", contentValues, "app_id = ?", new String[]{str7});
            } catch (SQLiteException e) {
                zzj.zzu.zzaV().zzb().zzc("Error resetting session-scoped event counts. appId", zzgu.zzl(str7), e);
            }
        }
        Map map7 = Collections.EMPTY_MAP;
        String str8 = "data";
        String str9 = "audience_id";
        try {
            if (zzp2 && zzp) {
                zzav zzj2 = this.zzg.zzj();
                String str10 = this.zza;
                C0875q.d(str10);
                ArrayMap arrayMap2 = new ArrayMap();
                try {
                    cursor7 = zzj2.zze().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str10}, null, null, null);
                    try {
                        try {
                        } catch (SQLiteException e2) {
                            e = e2;
                            zzj2.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str10), e);
                            map7 = Collections.EMPTY_MAP;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursor7 != null) {
                            cursor7.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    cursor7 = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor7 = null;
                    if (cursor7 != null) {
                    }
                    throw th;
                }
                if (cursor7.moveToFirst()) {
                    while (true) {
                        try {
                            com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursor7.getBlob(i2))).zzbc();
                            if (zzffVar.zzg()) {
                                Integer valueOf = Integer.valueOf(cursor7.getInt(i));
                                List list7 = (List) arrayMap2.get(valueOf);
                                if (list7 == null) {
                                    list6 = new ArrayList();
                                    arrayMap2.put(valueOf, list6);
                                } else {
                                    list6 = list7;
                                }
                                list6.add(zzffVar);
                            }
                        } catch (IOException e4) {
                            zzj2.zzu.zzaV().zzb().zzc("Failed to merge filter. appId", zzgu.zzl(str10), e4);
                        }
                        if (!cursor7.moveToNext()) {
                            break;
                        }
                        i = 0;
                        i2 = 1;
                    }
                    cursor7.close();
                    map = arrayMap2;
                    zzav zzj3 = this.zzg.zzj();
                    String str11 = this.zza;
                    zzj3.zzaw();
                    zzj3.zzg();
                    C0875q.d(str11);
                    cursor = zzj3.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str11}, null, null, null);
                    if (cursor.moveToFirst()) {
                        Map map8 = Collections.EMPTY_MAP;
                        cursor.close();
                        map2 = map8;
                        z3 = z2;
                        str2 = "data";
                        str3 = "audience_id";
                    } else {
                        ArrayMap arrayMap3 = new ArrayMap();
                        while (true) {
                            int i3 = cursor.getInt(0);
                            try {
                                arrayMap3.put(Integer.valueOf(i3), (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) zzpk.zzw(com.google.android.gms.internal.measurement.zzii.zzi(), cursor.getBlob(1))).zzbc());
                                z3 = z2;
                                str2 = str8;
                                str3 = str9;
                            } catch (IOException e5) {
                                z3 = z2;
                                str2 = str8;
                                try {
                                    str3 = str9;
                                    try {
                                        zzj3.zzu.zzaV().zzb().zzd("Failed to merge filter results. appId, audienceId, error", zzgu.zzl(str11), Integer.valueOf(i3), e5);
                                    } catch (SQLiteException e6) {
                                        e = e6;
                                        zzj3.zzu.zzaV().zzb().zzc("Database error querying filter results. appId", zzgu.zzl(str11), e);
                                        Map map9 = Collections.EMPTY_MAP;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        map2 = map9;
                                        if (!map2.isEmpty()) {
                                        }
                                        String str12 = str2;
                                        String str13 = str3;
                                        String str14 = "Skipping failed audience ID";
                                        if (!list.isEmpty()) {
                                        }
                                        if (!z) {
                                        }
                                    }
                                } catch (SQLiteException e7) {
                                    e = e7;
                                    str3 = str9;
                                    zzj3.zzu.zzaV().zzb().zzc("Database error querying filter results. appId", zzgu.zzl(str11), e);
                                    Map map92 = Collections.EMPTY_MAP;
                                    if (cursor != null) {
                                    }
                                    map2 = map92;
                                    if (!map2.isEmpty()) {
                                    }
                                    String str122 = str2;
                                    String str132 = str3;
                                    String str142 = "Skipping failed audience ID";
                                    if (!list.isEmpty()) {
                                    }
                                    if (!z) {
                                    }
                                }
                            }
                            if (!cursor.moveToNext()) {
                                break;
                            }
                            z2 = z3;
                            str8 = str2;
                            str9 = str3;
                        }
                        cursor.close();
                        map2 = arrayMap3;
                    }
                    if (!map2.isEmpty()) {
                        HashSet hashSet3 = new HashSet(map2.keySet());
                        if (z3) {
                            String str15 = this.zza;
                            zzav zzj4 = this.zzg.zzj();
                            String str16 = this.zza;
                            zzj4.zzaw();
                            zzj4.zzg();
                            C0875q.d(str16);
                            Map arrayMap4 = new ArrayMap();
                            SQLiteDatabase zze = zzj4.zze();
                            try {
                                try {
                                    cursor2 = zze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str16, str16});
                                    try {
                                        if (cursor2.moveToFirst()) {
                                            do {
                                                Integer valueOf2 = Integer.valueOf(cursor2.getInt(0));
                                                List list8 = (List) arrayMap4.get(valueOf2);
                                                if (list8 == null) {
                                                    list8 = new ArrayList();
                                                    arrayMap4.put(valueOf2, list8);
                                                }
                                                list8.add(Integer.valueOf(cursor2.getInt(1)));
                                            } while (cursor2.moveToNext());
                                        } else {
                                            arrayMap4 = Collections.EMPTY_MAP;
                                        }
                                    } catch (SQLiteException e8) {
                                        e = e8;
                                        zzj4.zzu.zzaV().zzb().zzc("Database error querying scoped filters. appId", zzgu.zzl(str16), e);
                                        arrayMap4 = Collections.EMPTY_MAP;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    r5 = zze;
                                    if (r5 != 0) {
                                        r5.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e9) {
                                e = e9;
                                cursor2 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                r5 = 0;
                                if (r5 != 0) {
                                }
                                throw th;
                            }
                            cursor2.close();
                            C0875q.d(str15);
                            ArrayMap arrayMap5 = new ArrayMap();
                            if (!map2.isEmpty()) {
                                Iterator it7 = map2.keySet().iterator();
                                while (it7.hasNext()) {
                                    Integer num = (Integer) it7.next();
                                    num.getClass();
                                    com.google.android.gms.internal.measurement.zzii zziiVar = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                    List list9 = (List) arrayMap4.get(num);
                                    if (list9 == null || list9.isEmpty()) {
                                        map4 = arrayMap4;
                                        hashSet2 = hashSet3;
                                        it = it7;
                                        arrayMap5.put(num, zziiVar);
                                    } else {
                                        zzpg zzpgVar = this.zzg;
                                        map4 = arrayMap4;
                                        hashSet2 = hashSet3;
                                        List zzq = zzpgVar.zzp().zzq(zziiVar.zzc(), list9);
                                        if (zzq.isEmpty()) {
                                            arrayMap4 = map4;
                                            hashSet3 = hashSet2;
                                        } else {
                                            com.google.android.gms.internal.measurement.zzih zzihVar = (com.google.android.gms.internal.measurement.zzih) zziiVar.zzcl();
                                            zzihVar.zzd();
                                            zzihVar.zzc(zzq);
                                            List zzq2 = zzpgVar.zzp().zzq(zziiVar.zza(), list9);
                                            zzihVar.zzb();
                                            zzihVar.zza(zzq2);
                                            ArrayList arrayList = new ArrayList();
                                            Iterator it8 = zziiVar.zze().iterator();
                                            while (it8.hasNext()) {
                                                Iterator it9 = it7;
                                                com.google.android.gms.internal.measurement.zzhq zzhqVar = (com.google.android.gms.internal.measurement.zzhq) it8.next();
                                                Iterator it10 = it8;
                                                if (!list9.contains(Integer.valueOf(zzhqVar.zzb()))) {
                                                    arrayList.add(zzhqVar);
                                                }
                                                it7 = it9;
                                                it8 = it10;
                                            }
                                            it = it7;
                                            zzihVar.zzf();
                                            zzihVar.zze(arrayList);
                                            ArrayList arrayList2 = new ArrayList();
                                            for (com.google.android.gms.internal.measurement.zzik zzikVar : zziiVar.zzg()) {
                                                if (!list9.contains(Integer.valueOf(zzikVar.zzb()))) {
                                                    arrayList2.add(zzikVar);
                                                }
                                            }
                                            zzihVar.zzh();
                                            zzihVar.zzg(arrayList2);
                                            arrayMap5.put(num, (com.google.android.gms.internal.measurement.zzii) zzihVar.zzbc());
                                        }
                                    }
                                    arrayMap4 = map4;
                                    hashSet3 = hashSet2;
                                    it7 = it;
                                }
                            }
                            hashSet = hashSet3;
                            map3 = arrayMap5;
                        } else {
                            hashSet = hashSet3;
                            map3 = map2;
                        }
                        Iterator it11 = hashSet.iterator();
                        while (it11.hasNext()) {
                            Integer num2 = (Integer) it11.next();
                            num2.getClass();
                            com.google.android.gms.internal.measurement.zzii zziiVar2 = (com.google.android.gms.internal.measurement.zzii) map3.get(num2);
                            BitSet bitSet = new BitSet();
                            BitSet bitSet2 = new BitSet();
                            ArrayMap arrayMap6 = new ArrayMap();
                            if (zziiVar2 != null && zziiVar2.zzf() != 0) {
                                for (com.google.android.gms.internal.measurement.zzhq zzhqVar2 : zziiVar2.zze()) {
                                    if (zzhqVar2.zza()) {
                                        Map map10 = map3;
                                        arrayMap6.put(Integer.valueOf(zzhqVar2.zzb()), zzhqVar2.zzc() ? Long.valueOf(zzhqVar2.zzd()) : null);
                                        map3 = map10;
                                    }
                                }
                            }
                            Map map11 = map3;
                            ArrayMap arrayMap7 = new ArrayMap();
                            if (zziiVar2 != null && zziiVar2.zzh() != 0) {
                                Iterator it12 = zziiVar2.zzg().iterator();
                                while (it12.hasNext()) {
                                    com.google.android.gms.internal.measurement.zzik zzikVar2 = (com.google.android.gms.internal.measurement.zzik) it12.next();
                                    if (zzikVar2.zza() && zzikVar2.zzd() > 0) {
                                        arrayMap7.put(Integer.valueOf(zzikVar2.zzb()), Long.valueOf(zzikVar2.zze(zzikVar2.zzd() - 1)));
                                        it12 = it12;
                                        zziiVar2 = zziiVar2;
                                    }
                                }
                            }
                            com.google.android.gms.internal.measurement.zzii zziiVar3 = zziiVar2;
                            if (zziiVar3 != null) {
                                int i4 = 0;
                                while (i4 < zziiVar3.zzb() * 64) {
                                    if (zzpk.zzn(zziiVar3.zza(), i4)) {
                                        z4 = zzp;
                                        this.zzu.zzaV().zzk().zzc("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i4));
                                        bitSet2.set(i4);
                                        if (zzpk.zzn(zziiVar3.zzc(), i4)) {
                                            bitSet.set(i4);
                                            i4++;
                                            zzp = z4;
                                        }
                                    } else {
                                        z4 = zzp;
                                    }
                                    arrayMap6.remove(Integer.valueOf(i4));
                                    i4++;
                                    zzp = z4;
                                }
                            }
                            boolean z5 = zzp;
                            com.google.android.gms.internal.measurement.zzii zziiVar4 = (com.google.android.gms.internal.measurement.zzii) map2.get(num2);
                            if (zzp2 && z5 && (list3 = (List) map.get(num2)) != null && this.zze != null && this.zzd != null) {
                                Iterator it13 = list3.iterator();
                                while (it13.hasNext()) {
                                    com.google.android.gms.internal.measurement.zzff zzffVar2 = (com.google.android.gms.internal.measurement.zzff) it13.next();
                                    int zzb = zzffVar2.zzb();
                                    Iterator it14 = it13;
                                    long longValue = this.zze.longValue() / 1000;
                                    if (zzffVar2.zzj()) {
                                        longValue = this.zzd.longValue() / 1000;
                                    }
                                    Integer valueOf3 = Integer.valueOf(zzb);
                                    if (arrayMap6.containsKey(valueOf3)) {
                                        arrayMap6.put(valueOf3, Long.valueOf(longValue));
                                    }
                                    if (arrayMap7.containsKey(valueOf3)) {
                                        arrayMap7.put(valueOf3, Long.valueOf(longValue));
                                    }
                                    it13 = it14;
                                }
                            }
                            this.zzc.put(num2, new zzy(this, this.zza, zziiVar4, bitSet, bitSet2, arrayMap6, arrayMap7, null));
                            str2 = str2;
                            map = map;
                            str3 = str3;
                            map2 = map2;
                            zzp = z5;
                            map3 = map11;
                        }
                    }
                    String str1222 = str2;
                    String str1322 = str3;
                    String str1422 = "Skipping failed audience ID";
                    if (!list.isEmpty()) {
                        zzz zzzVar2 = new zzz(this, null);
                        ArrayMap arrayMap8 = new ArrayMap();
                        Iterator it15 = list.iterator();
                        while (it15.hasNext()) {
                            com.google.android.gms.internal.measurement.zzhs zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it15.next();
                            com.google.android.gms.internal.measurement.zzhs zza = zzzVar2.zza(this.zza, zzhsVar);
                            if (zza != null) {
                                zzpg zzpgVar2 = this.zzg;
                                zzbc zzaf = zzpgVar2.zzj().zzaf(this.zza, zzhsVar, zza.zzd());
                                zzpgVar2.zzj().zzh(zzaf);
                                if (z) {
                                    continue;
                                } else {
                                    long j2 = zzaf.zzc;
                                    String zzd = zza.zzd();
                                    Map map12 = (Map) arrayMap8.get(zzd);
                                    if (map12 == null) {
                                        zzav zzj5 = zzpgVar2.zzj();
                                        zzzVar = zzzVar2;
                                        String str17 = this.zza;
                                        zzj5.zzaw();
                                        zzj5.zzg();
                                        C0875q.d(str17);
                                        C0875q.d(zzd);
                                        it3 = it15;
                                        ArrayMap arrayMap9 = new ArrayMap();
                                        try {
                                            try {
                                                str6 = str17;
                                                try {
                                                    Cursor query = zzj5.zze().query("event_filters", new String[]{str1322, str1222}, "app_id=? AND event_name=?", new String[]{str17, zzd}, null, null, null);
                                                    try {
                                                        try {
                                                            if (query.moveToFirst()) {
                                                                zzbcVar = zzaf;
                                                                while (true) {
                                                                    try {
                                                                        try {
                                                                            com.google.android.gms.internal.measurement.zzff zzffVar3 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), query.getBlob(1))).zzbc();
                                                                            Integer valueOf4 = Integer.valueOf(query.getInt(0));
                                                                            List list10 = (List) arrayMap9.get(valueOf4);
                                                                            if (list10 == null) {
                                                                                cursor6 = query;
                                                                                try {
                                                                                    list5 = new ArrayList();
                                                                                    arrayMap9.put(valueOf4, list5);
                                                                                } catch (SQLiteException e10) {
                                                                                    e = e10;
                                                                                    cursor5 = cursor6;
                                                                                    try {
                                                                                        zzj5.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str6), e);
                                                                                        map12 = Collections.EMPTY_MAP;
                                                                                        if (cursor5 != null) {
                                                                                        }
                                                                                        arrayMap8.put(zzd, map12);
                                                                                        it4 = map12.keySet().iterator();
                                                                                        while (it4.hasNext()) {
                                                                                        }
                                                                                        it15 = it3;
                                                                                        zzzVar2 = zzzVar;
                                                                                    } catch (Throwable th5) {
                                                                                        th = th5;
                                                                                        if (cursor5 != null) {
                                                                                            cursor5.close();
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                } catch (Throwable th6) {
                                                                                    th = th6;
                                                                                    cursor5 = cursor6;
                                                                                    if (cursor5 != null) {
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            } else {
                                                                                cursor6 = query;
                                                                                list5 = list10;
                                                                            }
                                                                            list5.add(zzffVar3);
                                                                        } catch (IOException e11) {
                                                                            cursor6 = query;
                                                                            zzj5.zzu.zzaV().zzb().zzc("Failed to merge filter. appId", zzgu.zzl(str6), e11);
                                                                        }
                                                                        if (!cursor6.moveToNext()) {
                                                                            break;
                                                                        }
                                                                        query = cursor6;
                                                                    } catch (SQLiteException e12) {
                                                                        e = e12;
                                                                        cursor6 = query;
                                                                    }
                                                                }
                                                                cursor6.close();
                                                                map12 = arrayMap9;
                                                            } else {
                                                                zzbcVar = zzaf;
                                                                map12 = Collections.EMPTY_MAP;
                                                                query.close();
                                                            }
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            cursor6 = query;
                                                        }
                                                    } catch (SQLiteException e13) {
                                                        e = e13;
                                                        cursor6 = query;
                                                        zzbcVar = zzaf;
                                                    }
                                                } catch (SQLiteException e14) {
                                                    e = e14;
                                                    zzbcVar = zzaf;
                                                    cursor5 = null;
                                                    zzj5.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str6), e);
                                                    map12 = Collections.EMPTY_MAP;
                                                    if (cursor5 != null) {
                                                        cursor5.close();
                                                    }
                                                    arrayMap8.put(zzd, map12);
                                                    it4 = map12.keySet().iterator();
                                                    while (it4.hasNext()) {
                                                    }
                                                    it15 = it3;
                                                    zzzVar2 = zzzVar;
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                cursor5 = null;
                                            }
                                        } catch (SQLiteException e15) {
                                            e = e15;
                                            str6 = str17;
                                        }
                                        arrayMap8.put(zzd, map12);
                                    } else {
                                        zzzVar = zzzVar2;
                                        it3 = it15;
                                        zzbcVar = zzaf;
                                    }
                                    it4 = map12.keySet().iterator();
                                    while (it4.hasNext()) {
                                        Integer num3 = (Integer) it4.next();
                                        int intValue = num3.intValue();
                                        if (this.zzb.contains(num3)) {
                                            this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", num3);
                                        } else {
                                            Iterator it16 = ((List) map12.get(num3)).iterator();
                                            boolean z6 = true;
                                            while (true) {
                                                if (!it16.hasNext()) {
                                                    map6 = map12;
                                                    it5 = it4;
                                                    j = j2;
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.zzff zzffVar4 = (com.google.android.gms.internal.measurement.zzff) it16.next();
                                                map6 = map12;
                                                it5 = it4;
                                                zzaa zzaaVar = new zzaa(this, this.zza, intValue, zzffVar4);
                                                j = j2;
                                                z6 = zzaaVar.zzd(this.zzd, this.zze, zza, j, zzbcVar, zzd(intValue, zzffVar4.zzb()));
                                                if (!z6) {
                                                    this.zzb.add(num3);
                                                    break;
                                                }
                                                zzc(num3).zza(zzaaVar);
                                                j2 = j;
                                                map12 = map6;
                                                it4 = it5;
                                            }
                                            if (!z6) {
                                                this.zzb.add(num3);
                                            }
                                            j2 = j;
                                            map12 = map6;
                                            it4 = it5;
                                        }
                                    }
                                    it15 = it3;
                                    zzzVar2 = zzzVar;
                                }
                            }
                        }
                    }
                    if (!z) {
                        return new ArrayList();
                    }
                    if (!list2.isEmpty()) {
                        ArrayMap arrayMap10 = new ArrayMap();
                        Iterator it17 = list2.iterator();
                        while (it17.hasNext()) {
                            com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) it17.next();
                            String zzc = zziuVar.zzc();
                            Map map13 = (Map) arrayMap10.get(zzc);
                            if (map13 == null) {
                                zzav zzj6 = this.zzg.zzj();
                                String str18 = this.zza;
                                zzj6.zzaw();
                                zzj6.zzg();
                                C0875q.d(str18);
                                C0875q.d(zzc);
                                ArrayMap arrayMap11 = new ArrayMap();
                                try {
                                    cursor4 = zzj6.zze().query("property_filters", new String[]{str1322, str1222}, "app_id=? AND property_name=?", new String[]{str18, zzc}, null, null, null);
                                    try {
                                        try {
                                        } catch (SQLiteException e16) {
                                            e = e16;
                                            it2 = it17;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        cursor3 = cursor4;
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e17) {
                                    e = e17;
                                    it2 = it17;
                                    str5 = str18;
                                    cursor4 = null;
                                } catch (Throwable th10) {
                                    th = th10;
                                    cursor3 = null;
                                }
                                if (cursor4.moveToFirst()) {
                                    while (true) {
                                        try {
                                            com.google.android.gms.internal.measurement.zzfn zzfnVar2 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzi(), cursor4.getBlob(1))).zzbc();
                                            Integer valueOf5 = Integer.valueOf(cursor4.getInt(0));
                                            List list11 = (List) arrayMap11.get(valueOf5);
                                            if (list11 == null) {
                                                it2 = it17;
                                                try {
                                                    list4 = new ArrayList();
                                                    arrayMap11.put(valueOf5, list4);
                                                } catch (SQLiteException e18) {
                                                    e = e18;
                                                    str5 = str18;
                                                    zzj6.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str5), e);
                                                    map13 = Collections.EMPTY_MAP;
                                                }
                                            } else {
                                                it2 = it17;
                                                list4 = list11;
                                            }
                                            list4.add(zzfnVar2);
                                            str5 = str18;
                                        } catch (IOException e19) {
                                            it2 = it17;
                                            str5 = str18;
                                            try {
                                                zzj6.zzu.zzaV().zzb().zzc("Failed to merge filter", zzgu.zzl(str5), e19);
                                            } catch (SQLiteException e20) {
                                                e = e20;
                                                zzj6.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str5), e);
                                                map13 = Collections.EMPTY_MAP;
                                            }
                                        }
                                        if (!cursor4.moveToNext()) {
                                            break;
                                        }
                                        it17 = it2;
                                        str18 = str5;
                                    }
                                    cursor4.close();
                                    map13 = arrayMap11;
                                    arrayMap10.put(zzc, map13);
                                } else {
                                    it2 = it17;
                                    map13 = Collections.EMPTY_MAP;
                                    cursor4.close();
                                    arrayMap10.put(zzc, map13);
                                }
                            } else {
                                it2 = it17;
                            }
                            Iterator it18 = map13.keySet().iterator();
                            while (true) {
                                if (it18.hasNext()) {
                                    Integer num4 = (Integer) it18.next();
                                    int intValue2 = num4.intValue();
                                    if (this.zzb.contains(num4)) {
                                        this.zzu.zzaV().zzk().zzb(str1422, num4);
                                        break;
                                    }
                                    Iterator it19 = ((List) map13.get(num4)).iterator();
                                    boolean z7 = true;
                                    while (true) {
                                        if (!it19.hasNext()) {
                                            map5 = map13;
                                            str4 = str1422;
                                            arrayMap = arrayMap10;
                                            break;
                                        }
                                        zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it19.next();
                                        zzicVar = this.zzu;
                                        map5 = map13;
                                        if (Log.isLoggable(zzicVar.zzaV().zzn(), 2)) {
                                            str4 = str1422;
                                            arrayMap = arrayMap10;
                                            zzicVar.zzaV().zzk().zzd("Evaluating filter. audience, filter, property", num4, zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                            zzicVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                        } else {
                                            str4 = str1422;
                                            arrayMap = arrayMap10;
                                        }
                                        if (!zzfnVar.zza() || zzfnVar.zzb() > 256) {
                                            break;
                                        }
                                        zzac zzacVar = new zzac(this, this.zza, intValue2, zzfnVar);
                                        z7 = zzacVar.zzd(this.zzd, this.zze, zziuVar, zzd(intValue2, zzfnVar.zzb()));
                                        if (!z7) {
                                            this.zzb.add(num4);
                                            break;
                                        }
                                        zzc(num4).zza(zzacVar);
                                        map13 = map5;
                                        arrayMap10 = arrayMap;
                                        str1422 = str4;
                                    }
                                    zzicVar.zzaV().zze().zzc("Invalid property filter ID. appId, id", zzgu.zzl(this.zza), String.valueOf(zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null));
                                    this.zzb.add(num4);
                                    map13 = map5;
                                    arrayMap10 = arrayMap;
                                    str1422 = str4;
                                }
                            }
                            it17 = it2;
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Set<Integer> keySet = this.zzc.keySet();
                    keySet.removeAll(this.zzb);
                    for (Integer num5 : keySet) {
                        int intValue3 = num5.intValue();
                        zzy zzyVar = (zzy) this.zzc.get(num5);
                        C0875q.g(zzyVar);
                        com.google.android.gms.internal.measurement.zzhg zzb2 = zzyVar.zzb(intValue3);
                        arrayList3.add(zzb2);
                        zzav zzj7 = this.zzg.zzj();
                        String str19 = this.zza;
                        com.google.android.gms.internal.measurement.zzii zzc2 = zzb2.zzc();
                        zzj7.zzaw();
                        zzj7.zzg();
                        C0875q.d(str19);
                        C0875q.g(zzc2);
                        byte[] zzcc = zzc2.zzcc();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("app_id", str19);
                        contentValues2.put(str1322, num5);
                        contentValues2.put("current_results", zzcc);
                        try {
                            try {
                                if (zzj7.zze().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                                    zzj7.zzu.zzaV().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str19));
                                }
                            } catch (SQLiteException e21) {
                                e = e21;
                                zzj7.zzu.zzaV().zzb().zzc("Error storing filter results. appId", zzgu.zzl(str19), e);
                            }
                        } catch (SQLiteException e22) {
                            e = e22;
                        }
                    }
                    return arrayList3;
                }
                cursor7.close();
            }
            if (cursor.moveToFirst()) {
            }
            if (!map2.isEmpty()) {
            }
            String str12222 = str2;
            String str13222 = str3;
            String str14222 = "Skipping failed audience ID";
            if (!list.isEmpty()) {
            }
            if (!z) {
            }
        } catch (Throwable th11) {
            th = th11;
            Cursor cursor8 = cursor;
            if (cursor8 != null) {
                cursor8.close();
            }
            throw th;
        }
        map = map7;
        zzav zzj32 = this.zzg.zzj();
        String str112 = this.zza;
        zzj32.zzaw();
        zzj32.zzg();
        C0875q.d(str112);
        cursor = zzj32.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str112}, null, null, null);
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final boolean zzbb() {
        return false;
    }
}
