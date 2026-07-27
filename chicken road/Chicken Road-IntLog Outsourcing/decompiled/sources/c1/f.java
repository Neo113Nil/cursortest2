package c1;

import android.database.Cursor;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f4904a;

    @Override // c1.g, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        cursor.moveToNext();
        return new Y0.g(cursor.getLong(0), this.f4904a);
    }
}
