package H0;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A0.k f494b;

    public /* synthetic */ e(long j3, A0.k kVar) {
        this.f493a = j3;
        this.f494b = kVar;
    }

    @Override // H0.g, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f493a));
        A0.k kVar = this.f494b;
        String str = kVar.f69a;
        x0.c cVar = kVar.f71c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(K0.a.a(cVar))}) < 1) {
            contentValues.put("backend_name", kVar.f69a);
            contentValues.put("priority", Integer.valueOf(K0.a.a(cVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
