package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.nn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0710nn implements InterfaceC0684mn {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7968a;

    public C0710nn(String str, HashMap<String, List<String>> hashMap) {
        this.f7968a = hashMap;
    }

    public final HashMap<String, List<String>> a() {
        return this.f7968a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0684mn
    public final boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean z3 = true;
            for (Map.Entry entry : this.f7968a.entrySet()) {
                try {
                    SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                    Cursor query = sQLiteDatabase2.query((String) entry.getKey(), null, null, null, null, null, null);
                    if (query == null) {
                        AbstractC0711no.a(query);
                        return false;
                    }
                    List list = (List) entry.getValue();
                    List asList = Arrays.asList(query.getColumnNames());
                    Collections.sort(asList);
                    z3 &= list.equals(asList);
                    AbstractC0711no.a(query);
                    sQLiteDatabase = sQLiteDatabase2;
                } catch (Throwable th) {
                    AbstractC0711no.a((Cursor) null);
                    throw th;
                }
            }
            return z3;
        } catch (Throwable unused) {
            return false;
        }
    }
}
