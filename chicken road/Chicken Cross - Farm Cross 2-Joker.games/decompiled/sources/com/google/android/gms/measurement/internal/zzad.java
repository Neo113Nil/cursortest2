package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
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

/* compiled from: com.google.android.gms:play-services-measurement@@23.0.0 */
/* loaded from: classes8.dex */
final class zzad extends zzos {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    zzad(zzpg zzpgVar) {
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

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|1|(2:2|(2:4|(2:6|7)(1:527))(2:528|529))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(16:(7:25|26|27|28|(1:30)(3:503|(1:505)(1:507)|506)|31|(1:34)(1:33))|(1:36)|37|38|39|40|41|42|(3:44|(1:46)|47)(4:467|(6:468|469|470|471|472|(1:475)(1:474))|(1:477)|478)|48|(1:50)(6:296|(9:298|299|300|301|302|303|304|305|(1:(4:307|(1:309)|310|(1:313)(1:312)))(1:452))(1:466)|361|(10:364|(3:368|(4:371|(5:373|374|(1:376)(1:380)|377|378)(1:381)|379|369)|382)|383|(3:387|(4:390|(3:395|396|397)|398|388)|401)|402|(3:404|(6:407|(2:409|(3:411|412|413))(1:416)|414|415|413|405)|417)|418|(3:427|(8:430|(1:432)|433|(1:435)|436|(3:438|439|440)(1:442)|441|428)|443)|444|362)|450|451)|51|52|(3:190|(4:193|(3:195|196|(8:198|199|(15:201|202|203|204|205|206|207|208|209|210|211|212|213|(3:(9:215|216|217|218|219|(3:221|222|223)(1:266)|224|225|(1:228)(1:227))|(1:230)|231)(2:270|271)|232)(1:292)|233|(4:236|(3:254|255|256)(4:238|239|(2:240|(2:242|(1:244)(2:245|246))(1:253))|(3:248|249|250)(1:252))|251|234)|257|258|259)(1:293))(1:294)|260|191)|295)|54|(6:56|(3:58|(6:61|(11:63|64|65|66|67|68|69|70|71|(3:(9:73|74|75|76|77|78|(1:80)|81|82)|(1:86)|87)(2:142|143)|88)(1:163)|89|(2:90|(2:92|(3:128|129|130)(8:94|(2:95|(4:97|(3:99|(1:101)(1:124)|102)(1:125)|103|(1:1)(2:107|(1:109)(2:110|111)))(2:126|127))|118|(1:120)(1:122)|121|113|114|115))(0))|131|59)|164)|165|(9:168|169|170|171|172|173|(2:175|176)(1:178)|177|166)|186|187)(2:188|189))(1:511))|526|38|39|40|41|42|(0)(0)|48|(0)(0)|51|52|(0)|54|(0)(0)|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x09b1, code lost:
    
        if (r8 != false) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x088f, code lost:
    
        if (r9 != null) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0868, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0866, code lost:
    
        if (r9 != null) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x06ef, code lost:
    
        if (r5 == null) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x06b9, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x06b7, code lost:
    
        if (r5 != null) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x02c4, code lost:
    
        if (r5 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x02c6, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x02fc, code lost:
    
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r13);
        r1 = new androidx.collection.ArrayMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x030b, code lost:
    
        if (r13.isEmpty() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x030f, code lost:
    
        r3 = r13.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x031b, code lost:
    
        if (r3.hasNext() == false) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x031d, code lost:
    
        r4 = ((java.lang.Integer) r3.next()).intValue();
        r5 = java.lang.Integer.valueOf(r4);
        r6 = (com.google.android.gms.internal.measurement.zzii) r13.get(r5);
        r7 = (java.util.List) r0.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0337, code lost:
    
        if (r7 == null) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x033d, code lost:
    
        if (r7.isEmpty() == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0341, code lost:
    
        r5 = r29.zzg;
        r19 = r0;
        r0 = r5.zzp().zzq(r6.zzc(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0355, code lost:
    
        if (r0.isEmpty() != false) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x03f1, code lost:
    
        r0 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0357, code lost:
    
        r8 = (com.google.android.gms.internal.measurement.zzih) r6.zzcl();
        r8.zzd();
        r8.zzc(r0);
        r0 = r5.zzp().zzq(r6.zza(), r7);
        r8.zzb();
        r8.zza(r0);
        r0 = new java.util.ArrayList();
        r5 = r6.zze().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0386, code lost:
    
        if (r5.hasNext() == false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0388, code lost:
    
        r22 = r3;
        r3 = (com.google.android.gms.internal.measurement.zzhq) r5.next();
        r23 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x03a0, code lost:
    
        if (r7.contains(java.lang.Integer.valueOf(r3.zzb())) != false) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x03a2, code lost:
    
        r0.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x03a5, code lost:
    
        r3 = r22;
        r5 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x03aa, code lost:
    
        r22 = r3;
        r8.zzf();
        r8.zze(r0);
        r0 = new java.util.ArrayList();
        r3 = r6.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x03c3, code lost:
    
        if (r3.hasNext() == false) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x03c5, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.zzik) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x03d7, code lost:
    
        if (r7.contains(java.lang.Integer.valueOf(r5.zzb())) != false) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x03d9, code lost:
    
        r0.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x03dd, code lost:
    
        r8.zzh();
        r8.zzg(r0);
        r1.put(java.lang.Integer.valueOf(r4), (com.google.android.gms.internal.measurement.zzii) r8.zzbc());
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x03fc, code lost:
    
        r0 = r19;
        r3 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x03f5, code lost:
    
        r19 = r0;
        r22 = r3;
        r1.put(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0402, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x02d0, code lost:
    
        if (r5 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x02f9, code lost:
    
        if (r5 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0226, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0227, code lost:
    
        r20 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x022e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x022f, code lost:
    
        r20 = "audience_id";
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x022a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x022b, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0154, code lost:
    
        if (r5 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0156, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0178, code lost:
    
        if (r5 == null) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0a6f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bb A[Catch: SQLiteException -> 0x0226, all -> 0x0a75, TRY_LEAVE, TryCatch #11 {all -> 0x0a75, blocks: (B:42:0x01b5, B:44:0x01bb, B:467:0x01c9, B:468:0x01ce, B:470:0x01d8, B:471:0x01e8, B:472:0x0210, B:487:0x01f5, B:490:0x0209, B:481:0x0232), top: B:41:0x01b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x01c9 A[Catch: SQLiteException -> 0x0226, all -> 0x0a75, TRY_ENTER, TryCatch #11 {all -> 0x0a75, blocks: (B:42:0x01b5, B:44:0x01bb, B:467:0x01c9, B:468:0x01ce, B:470:0x01d8, B:471:0x01e8, B:472:0x0210, B:487:0x01f5, B:490:0x0209, B:481:0x0232), top: B:41:0x01b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x079f  */
    /* JADX WARN: Type inference failed for: r0v192, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r4v29, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v65, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final List zzb(String str, List list, List list2, Long l, Long l2, boolean z) {
        int i;
        int i2;
        boolean z2;
        Cursor cursor;
        Map map;
        String str2;
        Cursor cursor2;
        Map map2;
        String str3;
        Map map3;
        String str4;
        String str5;
        List<com.google.android.gms.internal.measurement.zzff> list3;
        String str6;
        Cursor cursor3;
        zzz zzzVar;
        Iterator it;
        zzbc zzbcVar;
        String str7;
        Cursor cursor4;
        List list4;
        Map map4;
        com.google.android.gms.internal.measurement.zzfn zzfnVar;
        zzic zzicVar;
        Cursor cursor5;
        Cursor cursor6;
        com.google.android.gms.internal.measurement.zzfn zzfnVar2;
        ArrayMap arrayMap;
        Cursor cursor7;
        List list5;
        String str8 = "current_results";
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new ArrayMap();
        this.zzd = l;
        this.zze = l2;
        Iterator it2 = list.iterator();
        while (true) {
            i = 0;
            i2 = 1;
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzhs) it2.next()).zzd())) {
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
            String str9 = this.zza;
            zzj.zzaw();
            zzj.zzg();
            Preconditions.checkNotEmpty(str9);
            ?? contentValues = new ContentValues();
            ?? r5 = 0;
            contentValues.put("current_session_count", r5);
            try {
                r5 = "events";
                zzj.zze().update("events", contentValues, "app_id = ?", new String[]{str9});
                cursor = "events";
            } catch (SQLiteException e) {
                zzj.zzu.zzaV().zzb().zzc("Error resetting session-scoped event counts. appId", zzgu.zzl(str9), e);
                cursor = r5;
            }
        }
        Map emptyMap = Collections.emptyMap();
        String str10 = "Failed to merge filter. appId";
        String str11 = "audience_id";
        try {
            if (zzp2 && zzp) {
                zzav zzj2 = this.zzg.zzj();
                String str12 = this.zza;
                Preconditions.checkNotEmpty(str12);
                ArrayMap arrayMap2 = new ArrayMap();
                try {
                    try {
                        cursor7 = zzj2.zze().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str12}, null, null, null);
                        try {
                        } catch (SQLiteException e2) {
                            e = e2;
                            zzj2.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str12), e);
                            emptyMap = Collections.emptyMap();
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    cursor7 = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                    if (cursor != null) {
                    }
                    throw th;
                }
                if (cursor7.moveToFirst()) {
                    while (true) {
                        try {
                            com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursor7.getBlob(i2))).zzbc();
                            if (zzffVar.zzg()) {
                                Integer valueOf = Integer.valueOf(cursor7.getInt(i));
                                List list6 = (List) arrayMap2.get(valueOf);
                                if (list6 == null) {
                                    list5 = new ArrayList();
                                    arrayMap2.put(valueOf, list5);
                                } else {
                                    list5 = list6;
                                }
                                list5.add(zzffVar);
                            }
                        } catch (IOException e4) {
                            zzj2.zzu.zzaV().zzb().zzc("Failed to merge filter. appId", zzgu.zzl(str12), e4);
                        }
                        if (!cursor7.moveToNext()) {
                            break;
                        }
                        i = 0;
                        i2 = 1;
                    }
                    if (cursor7 != null) {
                        cursor7.close();
                    }
                    map = arrayMap2;
                    zzav zzj3 = this.zzg.zzj();
                    String str13 = this.zza;
                    zzj3.zzaw();
                    zzj3.zzg();
                    Preconditions.checkNotEmpty(str13);
                    cursor2 = zzj3.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str13}, null, null, null);
                    if (cursor2.moveToFirst()) {
                        Map emptyMap2 = Collections.emptyMap();
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        map2 = emptyMap2;
                        str2 = "audience_id";
                    } else {
                        ArrayMap arrayMap3 = new ArrayMap();
                        while (true) {
                            int i3 = cursor2.getInt(0);
                            try {
                                arrayMap3.put(Integer.valueOf(i3), (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) zzpk.zzw(com.google.android.gms.internal.measurement.zzii.zzi(), cursor2.getBlob(1))).zzbc());
                                arrayMap = arrayMap3;
                                str2 = str11;
                            } catch (IOException e5) {
                                arrayMap = arrayMap3;
                                str2 = str11;
                                try {
                                    zzj3.zzu.zzaV().zzb().zzd("Failed to merge filter results. appId, audienceId, error", zzgu.zzl(str13), Integer.valueOf(i3), e5);
                                } catch (SQLiteException e6) {
                                    e = e6;
                                    zzj3.zzu.zzaV().zzb().zzc("Database error querying filter results. appId", zzgu.zzl(str13), e);
                                    Map emptyMap3 = Collections.emptyMap();
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    map2 = emptyMap3;
                                    if (map2.isEmpty()) {
                                    }
                                    String str14 = str2;
                                    if (!list.isEmpty()) {
                                    }
                                    String str15 = str8;
                                    if (z) {
                                    }
                                }
                            }
                            if (!cursor2.moveToNext()) {
                                break;
                            }
                            arrayMap3 = arrayMap;
                            str11 = str2;
                        }
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        map2 = arrayMap;
                    }
                    if (map2.isEmpty()) {
                        str5 = "Database error querying filters. appId";
                        str4 = "Failed to merge filter. appId";
                    } else {
                        HashSet hashSet = new HashSet(map2.keySet());
                        if (z2) {
                            String str16 = this.zza;
                            zzav zzj4 = this.zzg.zzj();
                            String str17 = this.zza;
                            zzj4.zzaw();
                            zzj4.zzg();
                            Preconditions.checkNotEmpty(str17);
                            Map arrayMap4 = new ArrayMap();
                            ?? zze = zzj4.zze();
                            try {
                                str3 = "Database error querying filters. appId";
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            try {
                                int i4 = 0;
                                cursor3 = zze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str17, str17});
                                try {
                                    if (cursor3.moveToFirst()) {
                                        while (true) {
                                            Integer valueOf2 = Integer.valueOf(cursor3.getInt(i4));
                                            List list7 = (List) arrayMap4.get(valueOf2);
                                            if (list7 == null) {
                                                list7 = new ArrayList();
                                                arrayMap4.put(valueOf2, list7);
                                            }
                                            list7.add(Integer.valueOf(cursor3.getInt(1)));
                                            if (!cursor3.moveToNext()) {
                                                break;
                                            }
                                            i4 = 0;
                                        }
                                    } else {
                                        arrayMap4 = Collections.emptyMap();
                                    }
                                } catch (SQLiteException e7) {
                                    e = e7;
                                    zzj4.zzu.zzaV().zzb().zzc("Database error querying scoped filters. appId", zzgu.zzl(str17), e);
                                    arrayMap4 = Collections.emptyMap();
                                }
                            } catch (SQLiteException e8) {
                                e = e8;
                                cursor3 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                zze = 0;
                                if (zze != 0) {
                                    zze.close();
                                }
                                throw th;
                            }
                        } else {
                            str3 = "Database error querying filters. appId";
                            map3 = map2;
                        }
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            int intValue = ((Integer) it3.next()).intValue();
                            com.google.android.gms.internal.measurement.zzii zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(Integer.valueOf(intValue));
                            BitSet bitSet = new BitSet();
                            BitSet bitSet2 = new BitSet();
                            ArrayMap arrayMap5 = new ArrayMap();
                            if (zziiVar != null && zziiVar.zzf() != 0) {
                                for (com.google.android.gms.internal.measurement.zzhq zzhqVar : zziiVar.zze()) {
                                    if (zzhqVar.zza()) {
                                        arrayMap5.put(Integer.valueOf(zzhqVar.zzb()), zzhqVar.zzc() ? Long.valueOf(zzhqVar.zzd()) : null);
                                    }
                                }
                            }
                            ArrayMap arrayMap6 = new ArrayMap();
                            if (zziiVar != null && zziiVar.zzh() != 0) {
                                for (com.google.android.gms.internal.measurement.zzik zzikVar : zziiVar.zzg()) {
                                    if (zzikVar.zza() && zzikVar.zzd() > 0) {
                                        arrayMap6.put(Integer.valueOf(zzikVar.zzb()), Long.valueOf(zzikVar.zze(zzikVar.zzd() - 1)));
                                        map3 = map3;
                                    }
                                }
                            }
                            Map map5 = map3;
                            if (zziiVar != null) {
                                int i5 = 0;
                                while (i5 < zziiVar.zzb() * 64) {
                                    if (zzpk.zzn(zziiVar.zza(), i5)) {
                                        str6 = str10;
                                        this.zzu.zzaV().zzk().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(intValue), Integer.valueOf(i5));
                                        bitSet2.set(i5);
                                        if (zzpk.zzn(zziiVar.zzc(), i5)) {
                                            bitSet.set(i5);
                                            i5++;
                                            str10 = str6;
                                        }
                                    } else {
                                        str6 = str10;
                                    }
                                    arrayMap5.remove(Integer.valueOf(i5));
                                    i5++;
                                    str10 = str6;
                                }
                            }
                            String str18 = str10;
                            Integer valueOf3 = Integer.valueOf(intValue);
                            com.google.android.gms.internal.measurement.zzii zziiVar2 = (com.google.android.gms.internal.measurement.zzii) map2.get(valueOf3);
                            if (zzp2 && zzp && (list3 = (List) map.get(valueOf3)) != null && this.zze != null && this.zzd != null) {
                                for (com.google.android.gms.internal.measurement.zzff zzffVar2 : list3) {
                                    int zzb = zzffVar2.zzb();
                                    long longValue = this.zze.longValue() / 1000;
                                    if (zzffVar2.zzj()) {
                                        longValue = this.zzd.longValue() / 1000;
                                    }
                                    Integer valueOf4 = Integer.valueOf(zzb);
                                    if (arrayMap5.containsKey(valueOf4)) {
                                        arrayMap5.put(valueOf4, Long.valueOf(longValue));
                                    }
                                    if (arrayMap6.containsKey(valueOf4)) {
                                        arrayMap6.put(valueOf4, Long.valueOf(longValue));
                                    }
                                }
                            }
                            this.zzc.put(Integer.valueOf(intValue), new zzy(this, this.zza, zziiVar2, bitSet, bitSet2, arrayMap5, arrayMap6, null));
                            str10 = str18;
                            map = map;
                            map3 = map5;
                            map2 = map2;
                        }
                        str4 = str10;
                        str5 = str3;
                    }
                    String str142 = str2;
                    if (!list.isEmpty()) {
                        zzz zzzVar2 = new zzz(this, null);
                        ArrayMap arrayMap7 = new ArrayMap();
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            com.google.android.gms.internal.measurement.zzhs zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                            com.google.android.gms.internal.measurement.zzhs zza = zzzVar2.zza(this.zza, zzhsVar);
                            if (zza != null) {
                                zzpg zzpgVar = this.zzg;
                                zzbc zzaf = zzpgVar.zzj().zzaf(this.zza, zzhsVar, zza.zzd());
                                zzpgVar.zzj().zzh(zzaf);
                                if (!z) {
                                    long j = zzaf.zzc;
                                    String zzd = zza.zzd();
                                    Map map6 = (Map) arrayMap7.get(zzd);
                                    if (map6 == null) {
                                        zzav zzj5 = zzpgVar.zzj();
                                        String str19 = this.zza;
                                        zzj5.zzaw();
                                        zzj5.zzg();
                                        Preconditions.checkNotEmpty(str19);
                                        Preconditions.checkNotEmpty(zzd);
                                        zzzVar = zzzVar2;
                                        ArrayMap arrayMap8 = new ArrayMap();
                                        SQLiteDatabase zze2 = zzj5.zze();
                                        it = it4;
                                        try {
                                            try {
                                                String[] strArr = new String[2];
                                                String str20 = str142;
                                                try {
                                                    strArr[0] = str20;
                                                    strArr[1] = "data";
                                                    str142 = str20;
                                                    str7 = str8;
                                                } catch (SQLiteException e9) {
                                                    e = e9;
                                                    str142 = str20;
                                                    zzbcVar = zzaf;
                                                    str7 = str8;
                                                    cursor4 = null;
                                                    zzj5.zzu.zzaV().zzb().zzc(str5, zzgu.zzl(str19), e);
                                                    map6 = Collections.emptyMap();
                                                }
                                                try {
                                                    cursor4 = zze2.query("event_filters", strArr, "app_id=? AND event_name=?", new String[]{str19, zzd}, null, null, null);
                                                    try {
                                                        try {
                                                            if (cursor4.moveToFirst()) {
                                                                while (true) {
                                                                    try {
                                                                        com.google.android.gms.internal.measurement.zzff zzffVar3 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursor4.getBlob(1))).zzbc();
                                                                        Integer valueOf5 = Integer.valueOf(cursor4.getInt(0));
                                                                        List list8 = (List) arrayMap8.get(valueOf5);
                                                                        if (list8 == null) {
                                                                            zzbcVar = zzaf;
                                                                            try {
                                                                                list4 = new ArrayList();
                                                                                arrayMap8.put(valueOf5, list4);
                                                                            } catch (SQLiteException e10) {
                                                                                e = e10;
                                                                                zzj5.zzu.zzaV().zzb().zzc(str5, zzgu.zzl(str19), e);
                                                                                map6 = Collections.emptyMap();
                                                                            }
                                                                        } else {
                                                                            zzbcVar = zzaf;
                                                                            list4 = list8;
                                                                        }
                                                                        list4.add(zzffVar3);
                                                                    } catch (IOException e11) {
                                                                        zzbcVar = zzaf;
                                                                        zzj5.zzu.zzaV().zzb().zzc(str4, zzgu.zzl(str19), e11);
                                                                    }
                                                                    if (!cursor4.moveToNext()) {
                                                                        break;
                                                                    }
                                                                    zzaf = zzbcVar;
                                                                }
                                                                if (cursor4 != null) {
                                                                    cursor4.close();
                                                                }
                                                                map6 = arrayMap8;
                                                            } else {
                                                                zzbcVar = zzaf;
                                                                map6 = Collections.emptyMap();
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            if (cursor4 != null) {
                                                                cursor4.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (SQLiteException e12) {
                                                        e = e12;
                                                        zzbcVar = zzaf;
                                                    }
                                                } catch (SQLiteException e13) {
                                                    e = e13;
                                                    zzbcVar = zzaf;
                                                    cursor4 = null;
                                                    zzj5.zzu.zzaV().zzb().zzc(str5, zzgu.zzl(str19), e);
                                                    map6 = Collections.emptyMap();
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                cursor4 = null;
                                            }
                                        } catch (SQLiteException e14) {
                                            e = e14;
                                        }
                                        arrayMap7.put(zzd, map6);
                                    } else {
                                        zzzVar = zzzVar2;
                                        it = it4;
                                        zzbcVar = zzaf;
                                        str7 = str8;
                                    }
                                    Iterator it5 = map6.keySet().iterator();
                                    while (it5.hasNext()) {
                                        int intValue2 = ((Integer) it5.next()).intValue();
                                        Set set = this.zzb;
                                        Integer valueOf6 = Integer.valueOf(intValue2);
                                        if (set.contains(valueOf6)) {
                                            this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", valueOf6);
                                        } else {
                                            Iterator it6 = ((List) map6.get(valueOf6)).iterator();
                                            boolean z3 = true;
                                            while (true) {
                                                if (!it6.hasNext()) {
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.zzff zzffVar4 = (com.google.android.gms.internal.measurement.zzff) it6.next();
                                                zzaa zzaaVar = new zzaa(this, this.zza, intValue2, zzffVar4);
                                                z3 = zzaaVar.zzd(this.zzd, this.zze, zza, j, zzbcVar, zzd(intValue2, zzffVar4.zzb()));
                                                if (!z3) {
                                                    this.zzb.add(Integer.valueOf(intValue2));
                                                    break;
                                                }
                                                zzc(Integer.valueOf(intValue2)).zza(zzaaVar);
                                            }
                                            if (!z3) {
                                                this.zzb.add(Integer.valueOf(intValue2));
                                            }
                                        }
                                    }
                                    zzzVar2 = zzzVar;
                                    it4 = it;
                                    str8 = str7;
                                }
                            }
                        }
                    }
                    String str152 = str8;
                    if (z) {
                        return new ArrayList();
                    }
                    if (!list2.isEmpty()) {
                        ArrayMap arrayMap9 = new ArrayMap();
                        Iterator it7 = list2.iterator();
                        while (it7.hasNext()) {
                            com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) it7.next();
                            String zzc = zziuVar.zzc();
                            Map map7 = (Map) arrayMap9.get(zzc);
                            if (map7 == null) {
                                zzav zzj6 = this.zzg.zzj();
                                String str21 = this.zza;
                                zzj6.zzaw();
                                zzj6.zzg();
                                Preconditions.checkNotEmpty(str21);
                                Preconditions.checkNotEmpty(zzc);
                                ArrayMap arrayMap10 = new ArrayMap();
                                SQLiteDatabase zze3 = zzj6.zze();
                                try {
                                    try {
                                        String[] strArr2 = new String[2];
                                        try {
                                            strArr2[0] = str142;
                                            strArr2[1] = "data";
                                            String[] strArr3 = new String[2];
                                            strArr3[0] = str21;
                                            strArr3[1] = zzc;
                                            cursor6 = zze3.query("property_filters", strArr2, "app_id=? AND property_name=?", strArr3, null, null, null);
                                        } catch (SQLiteException e15) {
                                            e = e15;
                                            cursor6 = null;
                                            zzj6.zzu.zzaV().zzb().zzc(str5, zzgu.zzl(str21), e);
                                            map7 = Collections.emptyMap();
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        cursor5 = null;
                                    }
                                } catch (SQLiteException e16) {
                                    e = e16;
                                }
                                try {
                                    try {
                                        if (cursor6.moveToFirst()) {
                                            do {
                                                try {
                                                    zzfnVar2 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzi(), cursor6.getBlob(1))).zzbc();
                                                } catch (IOException e17) {
                                                    zzj6.zzu.zzaV().zzb().zzc("Failed to merge filter", zzgu.zzl(str21), e17);
                                                }
                                                try {
                                                    Integer valueOf7 = Integer.valueOf(cursor6.getInt(0));
                                                    List list9 = (List) arrayMap10.get(valueOf7);
                                                    if (list9 == null) {
                                                        list9 = new ArrayList();
                                                        arrayMap10.put(valueOf7, list9);
                                                    }
                                                    list9.add(zzfnVar2);
                                                } catch (SQLiteException e18) {
                                                    e = e18;
                                                    zzj6.zzu.zzaV().zzb().zzc(str5, zzgu.zzl(str21), e);
                                                    map7 = Collections.emptyMap();
                                                }
                                            } while (cursor6.moveToNext());
                                            if (cursor6 != null) {
                                                cursor6.close();
                                            }
                                            map7 = arrayMap10;
                                        } else {
                                            map7 = Collections.emptyMap();
                                        }
                                    } catch (SQLiteException e19) {
                                        e = e19;
                                    }
                                    arrayMap9.put(zzc, map7);
                                } catch (Throwable th8) {
                                    th = th8;
                                    cursor5 = cursor6;
                                    if (cursor5 != null) {
                                        cursor5.close();
                                    }
                                    throw th;
                                }
                            }
                            Iterator it8 = map7.keySet().iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    int intValue3 = ((Integer) it8.next()).intValue();
                                    Set set2 = this.zzb;
                                    Integer valueOf8 = Integer.valueOf(intValue3);
                                    if (set2.contains(valueOf8)) {
                                        this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", valueOf8);
                                        break;
                                    }
                                    Iterator it9 = ((List) map7.get(valueOf8)).iterator();
                                    boolean z4 = true;
                                    while (true) {
                                        if (!it9.hasNext()) {
                                            map4 = map7;
                                            break;
                                        }
                                        zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it9.next();
                                        zzicVar = this.zzu;
                                        if (Log.isLoggable(zzicVar.zzaV().zzn(), 2)) {
                                            map4 = map7;
                                            zzicVar.zzaV().zzk().zzd("Evaluating filter. audience, filter, property", Integer.valueOf(intValue3), zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                            zzicVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                        } else {
                                            map4 = map7;
                                        }
                                        if (!zzfnVar.zza() || zzfnVar.zzb() > 256) {
                                            break;
                                        }
                                        zzac zzacVar = new zzac(this, this.zza, intValue3, zzfnVar);
                                        z4 = zzacVar.zzd(this.zzd, this.zze, zziuVar, zzd(intValue3, zzfnVar.zzb()));
                                        if (!z4) {
                                            this.zzb.add(Integer.valueOf(intValue3));
                                            break;
                                        }
                                        zzc(Integer.valueOf(intValue3)).zza(zzacVar);
                                        map7 = map4;
                                    }
                                    zzicVar.zzaV().zze().zzc("Invalid property filter ID. appId, id", zzgu.zzl(this.zza), String.valueOf(zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null));
                                    this.zzb.add(Integer.valueOf(intValue3));
                                    map7 = map4;
                                }
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Set keySet = this.zzc.keySet();
                    keySet.removeAll(this.zzb);
                    Iterator it10 = keySet.iterator();
                    while (it10.hasNext()) {
                        int intValue4 = ((Integer) it10.next()).intValue();
                        Map map8 = this.zzc;
                        Integer valueOf9 = Integer.valueOf(intValue4);
                        zzy zzyVar = (zzy) map8.get(valueOf9);
                        Preconditions.checkNotNull(zzyVar);
                        com.google.android.gms.internal.measurement.zzhg zzb2 = zzyVar.zzb(intValue4);
                        arrayList.add(zzb2);
                        zzav zzj7 = this.zzg.zzj();
                        String str22 = this.zza;
                        com.google.android.gms.internal.measurement.zzii zzc2 = zzb2.zzc();
                        zzj7.zzaw();
                        zzj7.zzg();
                        Preconditions.checkNotEmpty(str22);
                        Preconditions.checkNotNull(zzc2);
                        byte[] zzcc = zzc2.zzcc();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("app_id", str22);
                        String str23 = str142;
                        contentValues2.put(str23, valueOf9);
                        String str24 = str152;
                        contentValues2.put(str24, zzcc);
                        try {
                        } catch (SQLiteException e20) {
                            e = e20;
                        }
                        try {
                            if (zzj7.zze().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                                zzj7.zzu.zzaV().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str22));
                            }
                        } catch (SQLiteException e21) {
                            e = e21;
                            zzj7.zzu.zzaV().zzb().zzc("Error storing filter results. appId", zzgu.zzl(str22), e);
                            str152 = str24;
                            str142 = str23;
                        }
                        str152 = str24;
                        str142 = str23;
                    }
                    return arrayList;
                }
                emptyMap = Collections.emptyMap();
            }
            if (cursor2.moveToFirst()) {
            }
            if (map2.isEmpty()) {
            }
            String str1422 = str2;
            if (!list.isEmpty()) {
            }
            String str1522 = str8;
            if (z) {
            }
        } catch (Throwable th9) {
            th = th9;
            Cursor cursor8 = cursor2;
            if (cursor8 != null) {
                cursor8.close();
            }
            throw th;
        }
        map = emptyMap;
        zzav zzj32 = this.zzg.zzj();
        String str132 = this.zza;
        zzj32.zzaw();
        zzj32.zzg();
        Preconditions.checkNotEmpty(str132);
        cursor2 = zzj32.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str132}, null, null, null);
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    protected final boolean zzbb() {
        return false;
    }
}
