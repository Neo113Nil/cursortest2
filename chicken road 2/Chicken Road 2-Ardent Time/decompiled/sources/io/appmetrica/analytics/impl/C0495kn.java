package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.kn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0495kn implements io.appmetrica.analytics.impl.InterfaceC0469jn {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f6316a;

    public C0495kn(java.lang.String str, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> hashMap) {
        this.f6316a = hashMap;
    }

    public final java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> a() {
        return this.f6316a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0469jn
    public final boolean a(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        try {
            boolean z2 = true;
            for (java.util.Map.Entry entry : this.f6316a.entrySet()) {
                try {
                    android.database.Cursor query = sQLiteDatabase.query((java.lang.String) entry.getKey(), null, null, null, null, null, null);
                    if (query == null) {
                        io.appmetrica.analytics.impl.AbstractC0522lo.a(query);
                        return false;
                    }
                    java.util.List list = (java.util.List) entry.getValue();
                    java.util.List asList = java.util.Arrays.asList(query.getColumnNames());
                    java.util.Collections.sort(asList);
                    z2 &= list.equals(asList);
                    io.appmetrica.analytics.impl.AbstractC0522lo.a(query);
                } catch (java.lang.Throwable th) {
                    io.appmetrica.analytics.impl.AbstractC0522lo.a((android.database.Cursor) null);
                    throw th;
                }
            }
            return z2;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }
}
