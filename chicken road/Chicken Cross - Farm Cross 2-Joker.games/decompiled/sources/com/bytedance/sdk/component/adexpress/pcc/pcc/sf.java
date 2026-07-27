package com.bytedance.sdk.component.adexpress.pcc.pcc;

import android.content.ContentValues;
import android.database.Cursor;

/* loaded from: classes4.dex */
public interface sf {
    int pcc(String str, ContentValues contentValues, String str2, String[] strArr);

    int pcc(String str, String str2, String[] strArr);

    Cursor pcc(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5);

    void pcc(String str, ContentValues contentValues);
}
