package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzekg extends com.google.android.gms.internal.ads.zzfzn {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzhcg zzb;

    public zzekg(android.content.Context context, com.google.android.gms.internal.ads.zzhcg zzhcgVar) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjF)).intValue(), com.google.android.gms.internal.ads.zzfzp.zza);
        this.zza = context;
        this.zzb = zzhcgVar;
    }

    static /* synthetic */ java.lang.Void zzf(com.google.android.gms.ads.internal.util.client.zzu zzuVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        zzj(sQLiteDatabase, zzuVar);
        return null;
    }

    static /* synthetic */ void zzg(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str, com.google.android.gms.ads.internal.util.client.zzu zzuVar) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("event_state", (java.lang.Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new java.lang.String[]{str});
        zzj(sQLiteDatabase, zzuVar);
    }

    static final void zzi(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new java.lang.String[]{str, java.lang.Integer.toString(0)});
    }

    private static void zzj(android.database.sqlite.SQLiteDatabase sQLiteDatabase, com.google.android.gms.ads.internal.util.client.zzu zzuVar) {
        java.lang.String sb;
        sQLiteDatabase.beginTransaction();
        try {
            java.lang.String[] strArr = {com.ironsource.C4.a.d, "url"};
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(15);
            sb2.append("event_state = 1");
            android.database.Cursor query = sQLiteDatabase.query("offline_buffered_pings", strArr, sb2.toString(), null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            java.lang.String[] strArr2 = new java.lang.String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex(com.ironsource.C4.a.d);
                int columnIndex2 = query.getColumnIndex("url");
                if (columnIndex2 != -1) {
                    long j = query.getLong(columnIndex);
                    java.lang.String string = query.getString(columnIndex2);
                    if (string == null) {
                        sb = "";
                    } else {
                        android.net.Uri parse = android.net.Uri.parse(string);
                        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - j;
                        java.lang.String encodedQuery = parse.getEncodedQuery();
                        android.net.Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                        clearQuery.appendQueryParameter("bd", java.lang.Long.toString(currentTimeMillis));
                        java.lang.String valueOf = java.lang.String.valueOf(clearQuery.build());
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 1 + java.lang.String.valueOf(encodedQuery).length());
                        sb3.append(valueOf);
                        sb3.append(com.ironsource.X3.j.c);
                        sb3.append(encodedQuery);
                        sb = sb3.toString();
                    }
                    strArr2[i] = sb;
                }
                i++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new java.lang.String[]{java.lang.Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i2 = 0; i2 < count; i2++) {
                zzuVar.zzc(strArr2[i2], null);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    final void zza(com.google.android.gms.internal.ads.zzfok zzfokVar) {
        java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzekf
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzekg.this.getWritableDatabase();
            }
        };
        com.google.android.gms.internal.ads.zzhcg zzhcgVar = this.zzb;
        com.google.android.gms.internal.ads.zzhbw.zzr(zzhcgVar.zzc(callable), new com.google.android.gms.internal.ads.zzejz(this, zzfokVar), zzhcgVar);
    }

    final void zzb(final android.database.sqlite.SQLiteDatabase sQLiteDatabase, final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final java.lang.String str) {
        this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzeka
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzekg.zzg(sQLiteDatabase, str, zzuVar);
            }
        });
    }

    public final void zzc(final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final java.lang.String str) {
        zza(new com.google.android.gms.internal.ads.zzfok() { // from class: com.google.android.gms.internal.ads.zzekb
            @Override // com.google.android.gms.internal.ads.zzfok
            public final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzekg.this.zzb((android.database.sqlite.SQLiteDatabase) obj, zzuVar, str);
                return null;
            }
        });
    }

    public final void zzd(final java.lang.String str) {
        zza(new com.google.android.gms.internal.ads.zzfok(this) { // from class: com.google.android.gms.internal.ads.zzekc
            @Override // com.google.android.gms.internal.ads.zzfok
            public final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzekg.zzi((android.database.sqlite.SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zze(final com.google.android.gms.internal.ads.zzeki zzekiVar) {
        zza(new com.google.android.gms.internal.ads.zzfok() { // from class: com.google.android.gms.internal.ads.zzekd
            @Override // com.google.android.gms.internal.ads.zzfok
            public final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzekg.this.zzh(zzekiVar, (android.database.sqlite.SQLiteDatabase) obj);
                return null;
            }
        });
    }

    final /* synthetic */ java.lang.Void zzh(com.google.android.gms.internal.ads.zzeki zzekiVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.ironsource.C4.a.d, java.lang.Long.valueOf(zzekiVar.zza));
        contentValues.put("gws_query_id", zzekiVar.zzb);
        contentValues.put("url", zzekiVar.zzc);
        contentValues.put("event_state", java.lang.Integer.valueOf(zzekiVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzt.zzc();
        android.content.Context context = this.zza;
        com.google.android.gms.ads.internal.util.zzbo zzC = com.google.android.gms.ads.internal.util.zzs.zzC(context);
        if (zzC != null) {
            try {
                zzC.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(context));
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }
}
