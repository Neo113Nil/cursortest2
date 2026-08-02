package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c41 implements e41 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f1087j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0648ra f1088k;

    public /* synthetic */ c41(long j, C0648ra c0648ra) {
        this.f1087j = j;
        this.f1088k = c0648ra;
    }

    @Override // p000.e41
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f1087j));
        C0648ra c0648ra = this.f1088k;
        String str = c0648ra.f6760a;
        dx0 dx0Var = c0648ra.f6762c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(gx0.m2162a(dx0Var))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(gx0.m2162a(dx0Var)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
