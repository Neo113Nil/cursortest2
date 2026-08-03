package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzad extends com.google.android.gms.measurement.internal.zzor {
    private java.lang.String zza;
    private java.util.Set zzb;
    private java.util.Map zzc;
    private java.lang.Long zzd;
    private java.lang.Long zze;

    zzad(com.google.android.gms.measurement.internal.zzpf zzpfVar) {
        super(zzpfVar);
    }

    private final com.google.android.gms.measurement.internal.zzy zzc(java.lang.Integer num) {
        if (this.zzc.containsKey(num)) {
            return (com.google.android.gms.measurement.internal.zzy) this.zzc.get(num);
        }
        com.google.android.gms.measurement.internal.zzy zzyVar = new com.google.android.gms.measurement.internal.zzy(this, this.zza, null);
        this.zzc.put(num, zzyVar);
        return zzyVar;
    }

    private final boolean zzd(int i, int i2) {
        com.google.android.gms.measurement.internal.zzy zzyVar = (com.google.android.gms.measurement.internal.zzy) this.zzc.get(java.lang.Integer.valueOf(i));
        if (zzyVar == null) {
            return false;
        }
        return zzyVar.zzc().get(i2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(6:19|20|21|22|23|(15:(7:25|26|27|28|(1:30)(3:504|(1:506)(1:508)|507)|31|(1:34)(1:33))|(1:36)|37|38|39|40|41|42|(3:44|(1:46)|47)(4:468|(6:469|470|471|472|473|(1:476)(1:475))|(1:478)|479)|48|(1:50)(6:299|(6:301|302|303|304|305|(1:(3:307|(1:309)|310))(1:453))(1:467)|319|(10:322|(3:326|(4:329|(5:331|332|(1:334)(1:338)|335|336)(1:339)|337|327)|340)|341|(3:345|(4:348|(3:353|354|355)|356|346)|359)|360|(3:362|(6:365|(2:367|(3:369|370|371))(1:374)|372|373|371|363)|375)|376|(3:385|(8:388|(1:390)|391|(1:393)|394|(3:396|397|398)(1:400)|399|386)|401)|402|320)|408|409)|51|(3:181|(4:184|(3:186|187|(8:189|190|(15:192|193|194|195|196|197|198|199|200|201|202|203|204|(4:206|(11:207|208|209|210|211|212|213|(3:215|216|217)(1:267)|218|219|(1:222)(1:221))|(1:224)|225)(3:274|275|(1:277))|226)(1:295)|227|(4:230|(3:248|249|250)(6:232|233|(2:234|(2:236|(1:238)(2:239|240))(2:246|247))|(1:242)|243|244)|245|228)|251|252|253)(1:296))(1:297)|254|182)|298)|53|(6:55|(3:57|(6:60|(7:62|63|64|65|66|(3:(9:68|69|70|71|72|73|(1:75)|76|77)|(1:81)|82)(2:137|138)|83)(1:154)|84|(2:85|(2:87|(3:123|124|125)(8:89|(2:90|(4:92|(3:94|(1:96)(1:119)|97)(1:120)|98|(1:1)(2:102|(1:104)(2:105|106)))(2:121|122))|113|(1:115)(1:117)|116|108|109|110))(0))|126|58)|155)|156|(9:159|160|161|162|163|164|(2:166|167)(1:169)|168|157)|177|178)(2:179|180))(1:512))|41|42|(0)(0)|48|(0)(0)|51|(0)|53|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(2:2|(2:4|(2:6|7)(1:528))(2:529|530))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(15:(7:25|26|27|28|(1:30)(3:504|(1:506)(1:508)|507)|31|(1:34)(1:33))|(1:36)|37|38|39|40|41|42|(3:44|(1:46)|47)(4:468|(6:469|470|471|472|473|(1:476)(1:475))|(1:478)|479)|48|(1:50)(6:299|(6:301|302|303|304|305|(1:(3:307|(1:309)|310))(1:453))(1:467)|319|(10:322|(3:326|(4:329|(5:331|332|(1:334)(1:338)|335|336)(1:339)|337|327)|340)|341|(3:345|(4:348|(3:353|354|355)|356|346)|359)|360|(3:362|(6:365|(2:367|(3:369|370|371))(1:374)|372|373|371|363)|375)|376|(3:385|(8:388|(1:390)|391|(1:393)|394|(3:396|397|398)(1:400)|399|386)|401)|402|320)|408|409)|51|(3:181|(4:184|(3:186|187|(8:189|190|(15:192|193|194|195|196|197|198|199|200|201|202|203|204|(4:206|(11:207|208|209|210|211|212|213|(3:215|216|217)(1:267)|218|219|(1:222)(1:221))|(1:224)|225)(3:274|275|(1:277))|226)(1:295)|227|(4:230|(3:248|249|250)(6:232|233|(2:234|(2:236|(1:238)(2:239|240))(2:246|247))|(1:242)|243|244)|245|228)|251|252|253)(1:296))(1:297)|254|182)|298)|53|(6:55|(3:57|(6:60|(7:62|63|64|65|66|(3:(9:68|69|70|71|72|73|(1:75)|76|77)|(1:81)|82)(2:137|138)|83)(1:154)|84|(2:85|(2:87|(3:123|124|125)(8:89|(2:90|(4:92|(3:94|(1:96)(1:119)|97)(1:120)|98|(1:1)(2:102|(1:104)(2:105|106)))(2:121|122))|113|(1:115)(1:117)|116|108|109|110))(0))|126|58)|155)|156|(9:159|160|161|162|163|164|(2:166|167)(1:169)|168|157)|177|178)(2:179|180))(1:512))|527|38|39|40|41|42|(0)(0)|48|(0)(0)|51|(0)|53|(0)(0)|(4:(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0989, code lost:
    
        if (r9 != false) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0877, code lost:
    
        if (r9 == null) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0853, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0851, code lost:
    
        if (r9 != null) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x02b9, code lost:
    
        if (r5 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x02bb, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x02eb, code lost:
    
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r13);
        r1 = new androidx.collection.ArrayMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x02fa, code lost:
    
        if (r13.isEmpty() == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x02fc, code lost:
    
        r23 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x03f2, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0300, code lost:
    
        r3 = r13.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x030c, code lost:
    
        if (r3.hasNext() == false) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x030e, code lost:
    
        r4 = (java.lang.Integer) r3.next();
        r4.intValue();
        r5 = (com.google.android.gms.internal.measurement.zzii) r13.get(r4);
        r6 = (java.util.List) r0.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0323, code lost:
    
        if (r6 == null) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0329, code lost:
    
        if (r6.isEmpty() == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x032d, code lost:
    
        r7 = r30.zzg;
        r17 = r0;
        r19 = r3;
        r0 = r7.zzp().zzq(r5.zzc(), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0343, code lost:
    
        if (r0.isEmpty() != false) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x03db, code lost:
    
        r0 = r17;
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0345, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.zzih) r5.zzcl();
        r3.zzd();
        r3.zzc(r0);
        r0 = r7.zzp().zzq(r5.zza(), r6);
        r3.zzb();
        r3.zza(r0);
        r0 = new java.util.ArrayList();
        r7 = r5.zze().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0374, code lost:
    
        if (r7.hasNext() == false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0376, code lost:
    
        r22 = r7;
        r7 = (com.google.android.gms.internal.measurement.zzhq) r7.next();
        r23 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x038e, code lost:
    
        if (r6.contains(java.lang.Integer.valueOf(r7.zzb())) != false) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0390, code lost:
    
        r0.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0393, code lost:
    
        r7 = r22;
        r8 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0398, code lost:
    
        r23 = r8;
        r3.zzf();
        r3.zze(r0);
        r0 = new java.util.ArrayList();
        r5 = r5.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x03b1, code lost:
    
        if (r5.hasNext() == false) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x03b3, code lost:
    
        r7 = (com.google.android.gms.internal.measurement.zzik) r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x03c5, code lost:
    
        if (r6.contains(java.lang.Integer.valueOf(r7.zzb())) != false) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x03c7, code lost:
    
        r0.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x03cb, code lost:
    
        r3.zzh();
        r3.zzg(r0);
        r1.put(r4, (com.google.android.gms.internal.measurement.zzii) r3.zzbc());
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x03ea, code lost:
    
        r0 = r17;
        r3 = r19;
        r8 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x03e1, code lost:
    
        r17 = r0;
        r19 = r3;
        r23 = r8;
        r1.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x02c3, code lost:
    
        if (r5 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x02e8, code lost:
    
        if (r5 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0222, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0223, code lost:
    
        r20 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x022a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x022b, code lost:
    
        r20 = "audience_id";
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0226, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0227, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0152, code lost:
    
        if (r5 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0154, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0176, code lost:
    
        if (r5 == null) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0a3f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b7 A[Catch: SQLiteException -> 0x0222, all -> 0x0a45, TRY_LEAVE, TryCatch #9 {SQLiteException -> 0x0222, blocks: (B:42:0x01b1, B:44:0x01b7, B:468:0x01c5, B:469:0x01ca, B:471:0x01d4, B:472:0x01e4, B:488:0x01f1), top: B:41:0x01b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x01c5 A[Catch: SQLiteException -> 0x0222, all -> 0x0a45, TRY_ENTER, TryCatch #9 {SQLiteException -> 0x0222, blocks: (B:42:0x01b1, B:44:0x01b7, B:468:0x01c5, B:469:0x01ca, B:471:0x01d4, B:472:0x01e4, B:488:0x01f1), top: B:41:0x01b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x078e  */
    /* JADX WARN: Type inference failed for: r0v196, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r4v28, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v56, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final java.util.List zzb(java.lang.String str, java.util.List list, java.util.List list2, java.lang.Long l, java.lang.Long l2, boolean z) {
        int i;
        int i2;
        boolean z2;
        android.database.Cursor cursor;
        java.util.Map map;
        java.lang.String str2;
        android.database.Cursor cursor2;
        ?? r13;
        java.lang.String str3;
        androidx.collection.ArrayMap arrayMap;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.util.List<com.google.android.gms.internal.measurement.zzff> list3;
        java.lang.String str7;
        android.database.Cursor cursor3;
        java.util.Iterator it;
        com.google.android.gms.measurement.internal.zzbc zzbcVar;
        java.lang.String str8;
        java.util.Map map2;
        android.database.Cursor cursor4;
        java.util.List list4;
        java.util.Map map3;
        com.google.android.gms.internal.measurement.zzfn zzfnVar;
        com.google.android.gms.measurement.internal.zzib zzibVar;
        android.database.Cursor cursor5;
        android.database.Cursor cursor6;
        androidx.collection.ArrayMap arrayMap2;
        android.database.Cursor cursor7;
        java.util.List list5;
        java.lang.String str9 = "current_results";
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new java.util.HashSet();
        this.zzc = new androidx.collection.ArrayMap();
        this.zzd = l;
        this.zze = l2;
        java.util.Iterator it2 = list.iterator();
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
        com.google.android.gms.internal.measurement.zzpq.zza();
        com.google.android.gms.measurement.internal.zzib zzibVar2 = this.zzu;
        boolean zzp = zzibVar2.zzc().zzp(this.zza, com.google.android.gms.measurement.internal.zzfx.zzaF);
        com.google.android.gms.internal.measurement.zzpq.zza();
        boolean zzp2 = zzibVar2.zzc().zzp(this.zza, com.google.android.gms.measurement.internal.zzfx.zzaE);
        if (z2) {
            com.google.android.gms.measurement.internal.zzav zzj = this.zzg.zzj();
            java.lang.String str10 = this.zza;
            zzj.zzay();
            zzj.zzg();
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str10);
            ?? contentValues = new android.content.ContentValues();
            ?? r5 = 0;
            contentValues.put("current_session_count", r5);
            try {
                r5 = "events";
                zzj.zze().update("events", contentValues, "app_id = ?", new java.lang.String[]{str10});
                cursor = "events";
            } catch (android.database.sqlite.SQLiteException e) {
                zzj.zzu.zzaV().zzb().zzc("Error resetting session-scoped event counts. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str10), e);
                cursor = r5;
            }
        }
        java.util.Map emptyMap = java.util.Collections.emptyMap();
        java.lang.String str11 = "Failed to merge filter. appId";
        java.lang.String str12 = "Database error querying filters. appId";
        java.lang.String str13 = "audience_id";
        try {
            if (zzp2 && zzp) {
                com.google.android.gms.measurement.internal.zzav zzj2 = this.zzg.zzj();
                java.lang.String str14 = this.zza;
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str14);
                androidx.collection.ArrayMap arrayMap3 = new androidx.collection.ArrayMap();
                try {
                    try {
                        cursor7 = zzj2.zze().query("event_filters", new java.lang.String[]{"audience_id", "data"}, "app_id=?", new java.lang.String[]{str14}, null, null, null);
                        try {
                        } catch (android.database.sqlite.SQLiteException e2) {
                            e = e2;
                            zzj2.zzu.zzaV().zzb().zzc("Database error querying filters. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str14), e);
                            emptyMap = java.util.Collections.emptyMap();
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (android.database.sqlite.SQLiteException e3) {
                    e = e3;
                    cursor7 = null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    cursor = null;
                    if (cursor != null) {
                    }
                    throw th;
                }
                if (cursor7.moveToFirst()) {
                    while (true) {
                        try {
                            com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) com.google.android.gms.measurement.internal.zzpj.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursor7.getBlob(i2))).zzbc();
                            if (zzffVar.zzg()) {
                                java.lang.Integer valueOf = java.lang.Integer.valueOf(cursor7.getInt(i));
                                java.util.List list6 = (java.util.List) arrayMap3.get(valueOf);
                                if (list6 == null) {
                                    list5 = new java.util.ArrayList();
                                    arrayMap3.put(valueOf, list5);
                                } else {
                                    list5 = list6;
                                }
                                list5.add(zzffVar);
                            }
                        } catch (java.io.IOException e4) {
                            zzj2.zzu.zzaV().zzb().zzc("Failed to merge filter. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str14), e4);
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
                    map = arrayMap3;
                    com.google.android.gms.measurement.internal.zzav zzj3 = this.zzg.zzj();
                    java.lang.String str15 = this.zza;
                    zzj3.zzay();
                    zzj3.zzg();
                    com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str15);
                    cursor2 = zzj3.zze().query("audience_filter_values", new java.lang.String[]{"audience_id", "current_results"}, "app_id=?", new java.lang.String[]{str15}, null, null, null);
                    if (cursor2.moveToFirst()) {
                        java.util.Map emptyMap2 = java.util.Collections.emptyMap();
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        r13 = emptyMap2;
                        str2 = "audience_id";
                    } else {
                        androidx.collection.ArrayMap arrayMap4 = new androidx.collection.ArrayMap();
                        while (true) {
                            int i3 = cursor2.getInt(0);
                            try {
                                arrayMap4.put(java.lang.Integer.valueOf(i3), (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) com.google.android.gms.measurement.internal.zzpj.zzw(com.google.android.gms.internal.measurement.zzii.zzi(), cursor2.getBlob(1))).zzbc());
                                arrayMap2 = arrayMap4;
                                str2 = str13;
                            } catch (java.io.IOException e5) {
                                arrayMap2 = arrayMap4;
                                str2 = str13;
                                try {
                                    zzj3.zzu.zzaV().zzb().zzd("Failed to merge filter results. appId, audienceId, error", com.google.android.gms.measurement.internal.zzgt.zzl(str15), java.lang.Integer.valueOf(i3), e5);
                                } catch (android.database.sqlite.SQLiteException e6) {
                                    e = e6;
                                    zzj3.zzu.zzaV().zzb().zzc("Database error querying filter results. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str15), e);
                                    java.util.Map emptyMap3 = java.util.Collections.emptyMap();
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    r13 = emptyMap3;
                                    if (r13.isEmpty()) {
                                    }
                                    if (!list.isEmpty()) {
                                    }
                                    java.lang.String str16 = str9;
                                    if (z) {
                                    }
                                }
                            }
                            if (!cursor2.moveToNext()) {
                                break;
                            }
                            arrayMap4 = arrayMap2;
                            str13 = str2;
                        }
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        r13 = arrayMap2;
                    }
                    if (r13.isEmpty()) {
                        str6 = "Database error querying filters. appId";
                        str4 = "Failed to merge filter. appId";
                        str5 = str2;
                    } else {
                        java.util.HashSet<java.lang.Integer> hashSet = new java.util.HashSet(r13.keySet());
                        if (z2) {
                            java.lang.String str17 = this.zza;
                            com.google.android.gms.measurement.internal.zzav zzj4 = this.zzg.zzj();
                            java.lang.String str18 = this.zza;
                            zzj4.zzay();
                            zzj4.zzg();
                            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str18);
                            java.util.Map arrayMap5 = new androidx.collection.ArrayMap();
                            ?? zze = zzj4.zze();
                            try {
                                try {
                                    cursor3 = zze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new java.lang.String[]{str18, str18});
                                    try {
                                        if (cursor3.moveToFirst()) {
                                            do {
                                                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(cursor3.getInt(0));
                                                java.util.List list7 = (java.util.List) arrayMap5.get(valueOf2);
                                                if (list7 == null) {
                                                    list7 = new java.util.ArrayList();
                                                    arrayMap5.put(valueOf2, list7);
                                                }
                                                list7.add(java.lang.Integer.valueOf(cursor3.getInt(1)));
                                            } while (cursor3.moveToNext());
                                        } else {
                                            arrayMap5 = java.util.Collections.emptyMap();
                                        }
                                    } catch (android.database.sqlite.SQLiteException e7) {
                                        e = e7;
                                        zzj4.zzu.zzaV().zzb().zzc("Database error querying scoped filters. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str18), e);
                                        arrayMap5 = java.util.Collections.emptyMap();
                                    }
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    if (zze != 0) {
                                        zze.close();
                                    }
                                    throw th;
                                }
                            } catch (android.database.sqlite.SQLiteException e8) {
                                e = e8;
                                cursor3 = null;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                zze = 0;
                                if (zze != 0) {
                                }
                                throw th;
                            }
                        } else {
                            str3 = "Database error querying filters. appId";
                            arrayMap = r13;
                        }
                        java.util.Map map4 = r13;
                        for (java.lang.Integer num : hashSet) {
                            num.intValue();
                            com.google.android.gms.internal.measurement.zzii zziiVar = (com.google.android.gms.internal.measurement.zzii) arrayMap.get(num);
                            java.util.BitSet bitSet = new java.util.BitSet();
                            java.util.BitSet bitSet2 = new java.util.BitSet();
                            androidx.collection.ArrayMap arrayMap6 = new androidx.collection.ArrayMap();
                            if (zziiVar != null && zziiVar.zzf() != 0) {
                                for (com.google.android.gms.internal.measurement.zzhq zzhqVar : zziiVar.zze()) {
                                    if (zzhqVar.zza()) {
                                        arrayMap6.put(java.lang.Integer.valueOf(zzhqVar.zzb()), zzhqVar.zzc() ? java.lang.Long.valueOf(zzhqVar.zzd()) : null);
                                    }
                                }
                            }
                            androidx.collection.ArrayMap arrayMap7 = new androidx.collection.ArrayMap();
                            if (zziiVar != null && zziiVar.zzh() != 0) {
                                java.util.Iterator it3 = zziiVar.zzg().iterator();
                                while (it3.hasNext()) {
                                    com.google.android.gms.internal.measurement.zzik zzikVar = (com.google.android.gms.internal.measurement.zzik) it3.next();
                                    if (zzikVar.zza() && zzikVar.zzd() > 0) {
                                        arrayMap7.put(java.lang.Integer.valueOf(zzikVar.zzb()), java.lang.Long.valueOf(zzikVar.zze(zzikVar.zzd() - 1)));
                                        arrayMap = arrayMap;
                                        it3 = it3;
                                    }
                                }
                            }
                            androidx.collection.ArrayMap arrayMap8 = arrayMap;
                            if (zziiVar != null) {
                                int i4 = 0;
                                while (i4 < zziiVar.zzb() * 64) {
                                    if (com.google.android.gms.measurement.internal.zzpj.zzn(zziiVar.zza(), i4)) {
                                        str7 = str11;
                                        this.zzu.zzaV().zzk().zzc("Filter already evaluated. audience ID, filter ID", num, java.lang.Integer.valueOf(i4));
                                        bitSet2.set(i4);
                                        if (com.google.android.gms.measurement.internal.zzpj.zzn(zziiVar.zzc(), i4)) {
                                            bitSet.set(i4);
                                            i4++;
                                            str11 = str7;
                                        }
                                    } else {
                                        str7 = str11;
                                    }
                                    arrayMap6.remove(java.lang.Integer.valueOf(i4));
                                    i4++;
                                    str11 = str7;
                                }
                            }
                            java.lang.String str19 = str11;
                            com.google.android.gms.internal.measurement.zzii zziiVar2 = (com.google.android.gms.internal.measurement.zzii) map4.get(num);
                            if (zzp2 && zzp && (list3 = (java.util.List) map.get(num)) != null && this.zze != null && this.zzd != null) {
                                for (com.google.android.gms.internal.measurement.zzff zzffVar2 : list3) {
                                    int zzb = zzffVar2.zzb();
                                    long longValue = this.zze.longValue() / 1000;
                                    if (zzffVar2.zzj()) {
                                        longValue = this.zzd.longValue() / 1000;
                                    }
                                    java.lang.Integer valueOf3 = java.lang.Integer.valueOf(zzb);
                                    if (arrayMap6.containsKey(valueOf3)) {
                                        arrayMap6.put(valueOf3, java.lang.Long.valueOf(longValue));
                                    }
                                    if (arrayMap7.containsKey(valueOf3)) {
                                        arrayMap7.put(valueOf3, java.lang.Long.valueOf(longValue));
                                    }
                                }
                            }
                            this.zzc.put(num, new com.google.android.gms.measurement.internal.zzy(this, this.zza, zziiVar2, bitSet, bitSet2, arrayMap6, arrayMap7, null));
                            map4 = map4;
                            str11 = str19;
                            map = map;
                            zzp = zzp;
                            arrayMap = arrayMap8;
                        }
                        str4 = str11;
                        str5 = str2;
                        str6 = str3;
                    }
                    if (!list.isEmpty()) {
                        com.google.android.gms.measurement.internal.zzz zzzVar = new com.google.android.gms.measurement.internal.zzz(this, null);
                        androidx.collection.ArrayMap arrayMap9 = new androidx.collection.ArrayMap();
                        java.util.Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            com.google.android.gms.internal.measurement.zzhs zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                            com.google.android.gms.internal.measurement.zzhs zza = zzzVar.zza(this.zza, zzhsVar);
                            if (zza != null) {
                                com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zzg;
                                com.google.android.gms.measurement.internal.zzbc zzah = zzpfVar.zzj().zzah(this.zza, zzhsVar, zza.zzd());
                                zzpfVar.zzj().zzh(zzah);
                                if (z) {
                                    continue;
                                } else {
                                    com.google.android.gms.measurement.internal.zzz zzzVar2 = zzzVar;
                                    long j = zzah.zzc;
                                    java.lang.String zzd = zza.zzd();
                                    java.util.Map map5 = (java.util.Map) arrayMap9.get(zzd);
                                    if (map5 == null) {
                                        com.google.android.gms.measurement.internal.zzav zzj5 = zzpfVar.zzj();
                                        java.lang.String str20 = this.zza;
                                        zzj5.zzay();
                                        zzj5.zzg();
                                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str20);
                                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzd);
                                        androidx.collection.ArrayMap arrayMap10 = new androidx.collection.ArrayMap();
                                        android.database.sqlite.SQLiteDatabase zze2 = zzj5.zze();
                                        it = it4;
                                        try {
                                            try {
                                                java.lang.String[] strArr = new java.lang.String[2];
                                                java.lang.String str21 = str5;
                                                try {
                                                    strArr[0] = str21;
                                                    strArr[1] = "data";
                                                    str8 = str9;
                                                    try {
                                                        android.database.Cursor query = zze2.query("event_filters", strArr, "app_id=? AND event_name=?", new java.lang.String[]{str20, zzd}, null, null, null);
                                                        try {
                                                            try {
                                                                if (query.moveToFirst()) {
                                                                    str5 = str21;
                                                                    while (true) {
                                                                        try {
                                                                            try {
                                                                                com.google.android.gms.internal.measurement.zzff zzffVar3 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) com.google.android.gms.measurement.internal.zzpj.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), query.getBlob(1))).zzbc();
                                                                                java.lang.Integer valueOf4 = java.lang.Integer.valueOf(query.getInt(0));
                                                                                java.util.List list8 = (java.util.List) arrayMap10.get(valueOf4);
                                                                                if (list8 == null) {
                                                                                    zzbcVar = zzah;
                                                                                    try {
                                                                                        list4 = new java.util.ArrayList();
                                                                                        arrayMap10.put(valueOf4, list4);
                                                                                    } catch (android.database.sqlite.SQLiteException e9) {
                                                                                        e = e9;
                                                                                        cursor4 = query;
                                                                                        try {
                                                                                            zzj5.zzu.zzaV().zzb().zzc(str6, com.google.android.gms.measurement.internal.zzgt.zzl(str20), e);
                                                                                            map5 = java.util.Collections.emptyMap();
                                                                                            if (cursor4 != null) {
                                                                                            }
                                                                                            arrayMap9.put(zzd, map5);
                                                                                            while (r5.hasNext()) {
                                                                                            }
                                                                                            zzzVar = zzzVar2;
                                                                                            it4 = it;
                                                                                            str9 = str8;
                                                                                        } catch (java.lang.Throwable th5) {
                                                                                            th = th5;
                                                                                            if (cursor4 != null) {
                                                                                                cursor4.close();
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    zzbcVar = zzah;
                                                                                    list4 = list8;
                                                                                }
                                                                                list4.add(zzffVar3);
                                                                            } catch (java.io.IOException e10) {
                                                                                zzbcVar = zzah;
                                                                                zzj5.zzu.zzaV().zzb().zzc(str4, com.google.android.gms.measurement.internal.zzgt.zzl(str20), e10);
                                                                            }
                                                                            if (!query.moveToNext()) {
                                                                                break;
                                                                            }
                                                                            zzah = zzbcVar;
                                                                        } catch (android.database.sqlite.SQLiteException e11) {
                                                                            e = e11;
                                                                            zzbcVar = zzah;
                                                                            cursor4 = query;
                                                                            zzj5.zzu.zzaV().zzb().zzc(str6, com.google.android.gms.measurement.internal.zzgt.zzl(str20), e);
                                                                            map5 = java.util.Collections.emptyMap();
                                                                            if (cursor4 != null) {
                                                                                cursor4.close();
                                                                            }
                                                                            arrayMap9.put(zzd, map5);
                                                                            while (r5.hasNext()) {
                                                                            }
                                                                            zzzVar = zzzVar2;
                                                                            it4 = it;
                                                                            str9 = str8;
                                                                        }
                                                                    }
                                                                    if (query != null) {
                                                                        query.close();
                                                                    }
                                                                    map5 = arrayMap10;
                                                                } else {
                                                                    str5 = str21;
                                                                    zzbcVar = zzah;
                                                                    map5 = java.util.Collections.emptyMap();
                                                                    if (query != null) {
                                                                        query.close();
                                                                    }
                                                                }
                                                            } catch (java.lang.Throwable th6) {
                                                                th = th6;
                                                                cursor4 = query;
                                                                if (cursor4 != null) {
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (android.database.sqlite.SQLiteException e12) {
                                                            e = e12;
                                                            str5 = str21;
                                                        }
                                                    } catch (android.database.sqlite.SQLiteException e13) {
                                                        e = e13;
                                                        str5 = str21;
                                                        zzbcVar = zzah;
                                                        cursor4 = null;
                                                        zzj5.zzu.zzaV().zzb().zzc(str6, com.google.android.gms.measurement.internal.zzgt.zzl(str20), e);
                                                        map5 = java.util.Collections.emptyMap();
                                                        if (cursor4 != null) {
                                                        }
                                                        arrayMap9.put(zzd, map5);
                                                        while (r5.hasNext()) {
                                                        }
                                                        zzzVar = zzzVar2;
                                                        it4 = it;
                                                        str9 = str8;
                                                    }
                                                } catch (android.database.sqlite.SQLiteException e14) {
                                                    e = e14;
                                                    str5 = str21;
                                                    zzbcVar = zzah;
                                                    str8 = str9;
                                                    cursor4 = null;
                                                    zzj5.zzu.zzaV().zzb().zzc(str6, com.google.android.gms.measurement.internal.zzgt.zzl(str20), e);
                                                    map5 = java.util.Collections.emptyMap();
                                                    if (cursor4 != null) {
                                                    }
                                                    arrayMap9.put(zzd, map5);
                                                    while (r5.hasNext()) {
                                                    }
                                                    zzzVar = zzzVar2;
                                                    it4 = it;
                                                    str9 = str8;
                                                }
                                            } catch (java.lang.Throwable th7) {
                                                th = th7;
                                                cursor4 = null;
                                            }
                                        } catch (android.database.sqlite.SQLiteException e15) {
                                            e = e15;
                                        }
                                        arrayMap9.put(zzd, map5);
                                    } else {
                                        it = it4;
                                        zzbcVar = zzah;
                                        str8 = str9;
                                    }
                                    for (java.lang.Integer num2 : map5.keySet()) {
                                        int intValue = num2.intValue();
                                        if (this.zzb.contains(num2)) {
                                            this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", num2);
                                        } else {
                                            java.util.Iterator it5 = ((java.util.List) map5.get(num2)).iterator();
                                            boolean z3 = true;
                                            while (true) {
                                                if (!it5.hasNext()) {
                                                    map2 = map5;
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.zzff zzffVar4 = (com.google.android.gms.internal.measurement.zzff) it5.next();
                                                com.google.android.gms.measurement.internal.zzaa zzaaVar = new com.google.android.gms.measurement.internal.zzaa(this, this.zza, intValue, zzffVar4);
                                                map2 = map5;
                                                z3 = zzaaVar.zzd(this.zzd, this.zze, zza, j, zzbcVar, zzd(intValue, zzffVar4.zzb()));
                                                if (!z3) {
                                                    this.zzb.add(num2);
                                                    break;
                                                }
                                                zzc(num2).zza(zzaaVar);
                                                map5 = map2;
                                            }
                                            if (!z3) {
                                                this.zzb.add(num2);
                                            }
                                            map5 = map2;
                                        }
                                    }
                                    zzzVar = zzzVar2;
                                    it4 = it;
                                    str9 = str8;
                                }
                            }
                        }
                    }
                    java.lang.String str162 = str9;
                    if (z) {
                        return new java.util.ArrayList();
                    }
                    if (!list2.isEmpty()) {
                        androidx.collection.ArrayMap arrayMap11 = new androidx.collection.ArrayMap();
                        java.util.Iterator it6 = list2.iterator();
                        while (it6.hasNext()) {
                            com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) it6.next();
                            java.lang.String zzc = zziuVar.zzc();
                            java.util.Map map6 = (java.util.Map) arrayMap11.get(zzc);
                            if (map6 == null) {
                                com.google.android.gms.measurement.internal.zzav zzj6 = this.zzg.zzj();
                                java.lang.String str22 = this.zza;
                                zzj6.zzay();
                                zzj6.zzg();
                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str22);
                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzc);
                                androidx.collection.ArrayMap arrayMap12 = new androidx.collection.ArrayMap();
                                try {
                                    cursor6 = zzj6.zze().query("property_filters", new java.lang.String[]{str5, "data"}, "app_id=? AND property_name=?", new java.lang.String[]{str22, zzc}, null, null, null);
                                    try {
                                        try {
                                            if (cursor6.moveToFirst()) {
                                                do {
                                                    try {
                                                        com.google.android.gms.internal.measurement.zzfn zzfnVar2 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) com.google.android.gms.measurement.internal.zzpj.zzw(com.google.android.gms.internal.measurement.zzfn.zzi(), cursor6.getBlob(1))).zzbc();
                                                        try {
                                                            java.lang.Integer valueOf5 = java.lang.Integer.valueOf(cursor6.getInt(0));
                                                            java.util.List list9 = (java.util.List) arrayMap12.get(valueOf5);
                                                            if (list9 == null) {
                                                                list9 = new java.util.ArrayList();
                                                                arrayMap12.put(valueOf5, list9);
                                                            }
                                                            list9.add(zzfnVar2);
                                                        } catch (android.database.sqlite.SQLiteException e16) {
                                                            e = e16;
                                                            zzj6.zzu.zzaV().zzb().zzc(str6, com.google.android.gms.measurement.internal.zzgt.zzl(str22), e);
                                                            map6 = java.util.Collections.emptyMap();
                                                        }
                                                    } catch (java.io.IOException e17) {
                                                        zzj6.zzu.zzaV().zzb().zzc("Failed to merge filter", com.google.android.gms.measurement.internal.zzgt.zzl(str22), e17);
                                                    }
                                                } while (cursor6.moveToNext());
                                                if (cursor6 != null) {
                                                    cursor6.close();
                                                }
                                                map6 = arrayMap12;
                                            } else {
                                                map6 = java.util.Collections.emptyMap();
                                            }
                                        } catch (android.database.sqlite.SQLiteException e18) {
                                            e = e18;
                                        }
                                    } catch (java.lang.Throwable th8) {
                                        th = th8;
                                        cursor5 = cursor6;
                                        if (cursor5 != null) {
                                            cursor5.close();
                                        }
                                        throw th;
                                    }
                                } catch (android.database.sqlite.SQLiteException e19) {
                                    e = e19;
                                    cursor6 = null;
                                } catch (java.lang.Throwable th9) {
                                    th = th9;
                                    cursor5 = null;
                                }
                                arrayMap11.put(zzc, map6);
                            }
                            java.util.Iterator it7 = map6.keySet().iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    java.lang.Integer num3 = (java.lang.Integer) it7.next();
                                    int intValue2 = num3.intValue();
                                    if (this.zzb.contains(num3)) {
                                        this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", num3);
                                        break;
                                    }
                                    java.util.Iterator it8 = ((java.util.List) map6.get(num3)).iterator();
                                    boolean z4 = true;
                                    while (true) {
                                        if (!it8.hasNext()) {
                                            map3 = map6;
                                            break;
                                        }
                                        zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it8.next();
                                        zzibVar = this.zzu;
                                        if (android.util.Log.isLoggable(zzibVar.zzaV().zzn(), 2)) {
                                            map3 = map6;
                                            zzibVar.zzaV().zzk().zzd("Evaluating filter. audience, filter, property", num3, zzfnVar.zza() ? java.lang.Integer.valueOf(zzfnVar.zzb()) : null, zzibVar.zzl().zzc(zzfnVar.zzc()));
                                            zzibVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                        } else {
                                            map3 = map6;
                                        }
                                        if (!zzfnVar.zza() || zzfnVar.zzb() > 256) {
                                            break;
                                        }
                                        com.google.android.gms.measurement.internal.zzac zzacVar = new com.google.android.gms.measurement.internal.zzac(this, this.zza, intValue2, zzfnVar);
                                        z4 = zzacVar.zzd(this.zzd, this.zze, zziuVar, zzd(intValue2, zzfnVar.zzb()));
                                        if (!z4) {
                                            this.zzb.add(num3);
                                            break;
                                        }
                                        zzc(num3).zza(zzacVar);
                                        map6 = map3;
                                    }
                                    zzibVar.zzaV().zze().zzc("Invalid property filter ID. appId, id", com.google.android.gms.measurement.internal.zzgt.zzl(this.zza), java.lang.String.valueOf(zzfnVar.zza() ? java.lang.Integer.valueOf(zzfnVar.zzb()) : null));
                                    this.zzb.add(num3);
                                    map6 = map3;
                                }
                            }
                        }
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Set<java.lang.Integer> keySet = this.zzc.keySet();
                    keySet.removeAll(this.zzb);
                    for (java.lang.Integer num4 : keySet) {
                        int intValue3 = num4.intValue();
                        com.google.android.gms.measurement.internal.zzy zzyVar = (com.google.android.gms.measurement.internal.zzy) this.zzc.get(num4);
                        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzyVar);
                        com.google.android.gms.internal.measurement.zzhg zzb2 = zzyVar.zzb(intValue3);
                        arrayList.add(zzb2);
                        com.google.android.gms.measurement.internal.zzav zzj7 = this.zzg.zzj();
                        java.lang.String str23 = this.zza;
                        com.google.android.gms.internal.measurement.zzii zzc2 = zzb2.zzc();
                        zzj7.zzay();
                        zzj7.zzg();
                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str23);
                        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzc2);
                        byte[] zzcc = zzc2.zzcc();
                        android.content.ContentValues contentValues2 = new android.content.ContentValues();
                        contentValues2.put("app_id", str23);
                        java.lang.String str24 = str5;
                        contentValues2.put(str24, num4);
                        java.lang.String str25 = str162;
                        contentValues2.put(str25, zzcc);
                        try {
                            try {
                                if (zzj7.zze().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                                    zzj7.zzu.zzaV().zzb().zzb("Failed to insert filter results (got -1). appId", com.google.android.gms.measurement.internal.zzgt.zzl(str23));
                                }
                            } catch (android.database.sqlite.SQLiteException e20) {
                                e = e20;
                                zzj7.zzu.zzaV().zzb().zzc("Error storing filter results. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str23), e);
                                str5 = str24;
                                str162 = str25;
                            }
                        } catch (android.database.sqlite.SQLiteException e21) {
                            e = e21;
                        }
                        str5 = str24;
                        str162 = str25;
                    }
                    return arrayList;
                }
                emptyMap = java.util.Collections.emptyMap();
            }
            if (cursor2.moveToFirst()) {
            }
            if (r13.isEmpty()) {
            }
            if (!list.isEmpty()) {
            }
            java.lang.String str1622 = str9;
            if (z) {
            }
        } catch (java.lang.Throwable th10) {
            th = th10;
            android.database.Cursor cursor8 = cursor2;
            if (cursor8 != null) {
                cursor8.close();
            }
            throw th;
        }
        map = emptyMap;
        com.google.android.gms.measurement.internal.zzav zzj32 = this.zzg.zzj();
        java.lang.String str152 = this.zza;
        zzj32.zzay();
        zzj32.zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str152);
        cursor2 = zzj32.zze().query("audience_filter_values", new java.lang.String[]{"audience_id", "current_results"}, "app_id=?", new java.lang.String[]{str152}, null, null, null);
    }

    @Override // com.google.android.gms.measurement.internal.zzor
    protected final boolean zzbb() {
        return false;
    }
}
