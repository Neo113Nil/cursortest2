package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

/* loaded from: classes.dex */
public final class Xm extends Gt {

    /* renamed from: k, reason: collision with root package name */
    public final Context f12235k;

    /* renamed from: l, reason: collision with root package name */
    public final C0606Hd f12236l;

    public Xm(Context context, C0606Hd c0606Hd) {
        super(((Integer) Q2.r.f5053d.f5056c.a(F7.W7)).intValue(), context, "AdMobOfflineBufferedPings.db");
        this.f12235k = context;
        this.f12236l = c0606Hd;
    }

    public static void f(SQLiteDatabase sQLiteDatabase, U2.m mVar) {
        SQLiteDatabase sQLiteDatabase2;
        String str;
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                Cursor query = sQLiteDatabase2.query("offline_buffered_pings", new String[]{"timestamp", "url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
                int count = query.getCount();
                String[] strArr = new String[count];
                int i = 0;
                while (query.moveToNext()) {
                    int columnIndex = query.getColumnIndex("timestamp");
                    int columnIndex2 = query.getColumnIndex("url");
                    if (columnIndex2 != -1) {
                        long j5 = query.getLong(columnIndex);
                        String string = query.getString(columnIndex2);
                        if (string == null) {
                            str = "";
                        } else {
                            Uri parse = Uri.parse(string);
                            P2.o.f4767B.f4776j.getClass();
                            long currentTimeMillis = System.currentTimeMillis() - j5;
                            String encodedQuery = parse.getEncodedQuery();
                            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                            clearQuery.appendQueryParameter("bd", Long.toString(currentTimeMillis));
                            str = String.valueOf(clearQuery.build()) + "&" + encodedQuery;
                        }
                        strArr[i] = str;
                    }
                    i++;
                }
                query.close();
                sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
                for (int i5 = 0; i5 < count; i5++) {
                    mVar.d(strArr[i5]);
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                sQLiteDatabase2.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    public final void b(String str) {
        d(new Cx(str, 3));
    }

    public final void d(Ar ar) {
        S4 s42 = new S4(6, this);
        C0606Hd c0606Hd = this.f12236l;
        E3.a d5 = c0606Hd.d(s42);
        d5.a(new Kw(0, d5, new Om(ar, 1)), c0606Hd);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i5) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i5) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
