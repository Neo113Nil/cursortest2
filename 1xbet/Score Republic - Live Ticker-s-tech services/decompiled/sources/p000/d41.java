package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d41 implements e41, ic1 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f1550j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1551k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1552l;

    public /* synthetic */ d41(long j, Object obj, Object obj2) {
        this.f1551k = obj;
        this.f1552l = obj2;
        this.f1550j = j;
    }

    @Override // p000.e41
    public Object apply(Object obj) {
        String str = (String) this.f1551k;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((ck0) this.f1552l).f1280j;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.f1550j;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // p000.ic1
    /* JADX INFO: renamed from: c */
    public Object mo1085c() {
        ng1 ng1Var = (ng1) this.f1551k;
        C0648ra c0648ra = (C0648ra) this.f1552l;
        g41 g41Var = ng1Var.f5432c;
        long jMo159g = ng1Var.f5436g.mo159g() + this.f1550j;
        g41Var.getClass();
        g41Var.m1981i(new c41(jMo159g, c0648ra));
        return null;
    }
}
