package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.P;
import I2.z;
import J2.n;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzeaf extends zzfoq {
    private final Context zza;
    private final zzgbn zzb;

    public zzeaf(Context context, zzgbn zzgbnVar) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzir)).intValue(), zzfos.zza);
        this.zza = context;
        this.zzb = zzgbnVar;
    }

    public static Void zza(zzeaf zzeafVar, zzeah zzeahVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzeahVar.zza));
        contentValues.put("gws_query_id", zzeahVar.zzb);
        contentValues.put("url", zzeahVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzeahVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        P p5 = o.f1952C.f1957c;
        z zVarA = P.a(zzeafVar.zza);
        if (zVarA != null) {
            try {
                zVarA.zze(new p105o3.b(zzeafVar.zza));
            } catch (RemoteException e7) {
                J.l("Failed to schedule offline ping sender.", e7);
            }
        }
        return null;
    }

    public static /* synthetic */ Void zzb(n nVar, SQLiteDatabase sQLiteDatabase) {
        zzj(sQLiteDatabase, nVar);
        return null;
    }

    public static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, n nVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, nVar);
    }

    public static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, n nVar) {
        String str;
        sQLiteDatabase.beginTransaction();
        try {
            Cursor cursorQuery = sQLiteDatabase.query("offline_buffered_pings", new String[]{"timestamp", "url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = cursorQuery.getCount();
            String[] strArr = new String[count];
            int i7 = 0;
            while (cursorQuery.moveToNext()) {
                int columnIndex = cursorQuery.getColumnIndex("timestamp");
                int columnIndex2 = cursorQuery.getColumnIndex("url");
                if (columnIndex2 != -1) {
                    long j = cursorQuery.getLong(columnIndex);
                    String string = cursorQuery.getString(columnIndex2);
                    if (string == null) {
                        str = "";
                    } else {
                        Uri uri = Uri.parse(string);
                        o.f1952C.j.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() - j;
                        String encodedQuery = uri.getEncodedQuery();
                        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                        builderClearQuery.appendQueryParameter("bd", Long.toString(jCurrentTimeMillis));
                        str = String.valueOf(builderClearQuery.build()) + "&" + encodedQuery;
                    }
                    strArr[i7] = str;
                }
                i7++;
            }
            cursorQuery.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            for (int i8 = 0; i8 < count; i8++) {
                nVar.zza(strArr[i8]);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void zzc(final String str) {
        zze(new zzfei(this) { // from class: com.google.android.gms.internal.ads.zzead
            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object zza(Object obj) {
                zzeaf.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zzd(final zzeah zzeahVar) {
        zze(new zzfei() { // from class: com.google.android.gms.internal.ads.zzdzz
            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object zza(Object obj) {
                zzeaf.zza(this.zza, zzeahVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public final void zze(zzfei zzfeiVar) {
        zzgbc.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeab
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.getWritableDatabase();
            }
        }), new zzeae(this, zzfeiVar), this.zzb);
    }

    public final void zzg(final SQLiteDatabase sQLiteDatabase, final n nVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeac
            @Override // java.lang.Runnable
            public final void run() {
                zzeaf.zzf(sQLiteDatabase, str, nVar);
            }
        });
    }

    public final void zzh(final n nVar, final String str) {
        zze(new zzfei() { // from class: com.google.android.gms.internal.ads.zzeaa
            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object zza(Object obj) {
                this.zza.zzg((SQLiteDatabase) obj, nVar, str);
                return null;
            }
        });
    }
}
