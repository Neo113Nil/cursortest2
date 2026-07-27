package com.onesignal.core.internal.database;

import android.content.ContentValues;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public interface IDatabase {

    public static final class DefaultImpls {
        public static /* synthetic */ void query$default(IDatabase iDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, InterfaceC1441l interfaceC1441l, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
            }
            iDatabase.query(str, (i2 & 2) != 0 ? null : strArr, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : strArr2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : str6, interfaceC1441l);
        }
    }

    void delete(String str, String str2, String[] strArr);

    void insert(String str, String str2, ContentValues contentValues);

    void insertOrThrow(String str, String str2, ContentValues contentValues);

    void query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, InterfaceC1441l interfaceC1441l);

    int update(String str, ContentValues contentValues, String str2, String[] strArr);
}
