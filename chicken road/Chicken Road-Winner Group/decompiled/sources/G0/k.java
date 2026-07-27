package G0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements I0.b, H0.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f418c;

    public /* synthetic */ k(long j3, Object obj, Object obj2) {
        this.f417b = obj;
        this.f418c = obj2;
        this.f416a = j3;
    }

    @Override // H0.g, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i3 = ((D0.d) this.f418c).f278a;
        String num = Integer.toString(i3);
        String str = (String) this.f417b;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, num});
        try {
            boolean z3 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j3 = this.f416a;
            if (z3) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j3 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i3)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i3));
            contentValues.put("events_dropped_count", Long.valueOf(j3));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // I0.b
    public Object execute() {
        l lVar = (l) this.f417b;
        long c3 = lVar.f424g.c() + this.f416a;
        H0.i iVar = (H0.i) lVar.f421c;
        A0.k kVar = (A0.k) this.f418c;
        iVar.getClass();
        iVar.c(new H0.e(c3, kVar));
        return null;
    }
}
