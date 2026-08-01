package com.bytedance.sdk.component.wh.pcc.pcc.pcc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes4.dex */
public class gm {
    public static void pcc(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            pcc.pcc(context).pcc().pcc(str, (String) null, contentValues);
        } catch (Throwable unused) {
        }
    }

    public static void pcc(Context context, String str, List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list) {
        if (list == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            pcc.pcc(context).pcc().pcc(str, (String) null, list);
        } catch (Throwable unused) {
        }
    }

    public static int pcc(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return pcc.pcc(context).pcc().pcc(str, str2, strArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int pcc(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            try {
                return pcc.pcc(context).pcc().pcc(str, contentValues, str2, strArr);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public static Cursor pcc(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return pcc.pcc(context).pcc().pcc(str, strArr, str2, strArr2, null, null, str5);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void pcc(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            pcc.pcc(context).pcc().pcc(Uri.decode(str));
        } catch (Throwable unused) {
        }
    }
}
