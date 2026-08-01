package com.ironsource.adqualitysdk.sdk.i;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.ironsource.adqualitysdk.sdk.StringFog;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓼ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0834 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String[] f2439;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final SQLiteDatabase f2443;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String f2442 = StringFog.decrypt("2Ys3lZX0Tw8=\n", "sv1o5uGbPWo=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2441 = StringFog.decrypt("Ve3V\n", "PoissoUqKts=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f2440 = StringFog.decrypt("w4At\n", "teFBVEgKuIo=\n");

    static {
        StringFog.decrypt("2wKfGZnOQ237JaddgehpZPcnvzmpz0Nj8yK7\n", "klHefci7IgE=\n");
        f2439 = new String[]{StringFog.decrypt("VphC\n", "Pf07mjm+KYw=\n"), StringFog.decrypt("dDFG\n", "AlAqSGeNa7w=\n")};
    }

    public C0834(Context context, String str) {
        this.f2443 = new C0835(context, str).getWritableDatabase();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized int m5677(String str) {
        Cursor cursor = null;
        try {
            cursor = this.f2443.query(f2442, new String[]{StringFog.decrypt("GuSa3I2TOEU1gg==\n", "WavPktm7TiQ=\n")}, StringFog.decrypt("Nsk+PsRquTt9kw==\n", "XaxHHogj8n4=\n"), new String[]{str.replace(GMTDateParser.ANY, '%')}, null, null, null);
            if (cursor == null || !cursor.moveToFirst()) {
                return 0;
            }
            int i = cursor.getInt(0);
            cursor.close();
            return i;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m5680(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(f2440, str2);
        String decrypt = StringFog.decrypt("Q8ORrfoBLg==\n", "KKbojcchESw=\n");
        String[] strArr = {str};
        SQLiteDatabase sQLiteDatabase = this.f2443;
        String str3 = f2442;
        if (sQLiteDatabase.update(str3, contentValues, decrypt, strArr) == 0) {
            contentValues.put(f2441, str);
            this.f2443.replace(str3, null, contentValues);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized String m5678(String str) {
        Throwable th;
        Cursor cursor;
        try {
            cursor = this.f2443.query(f2442, f2439, StringFog.decrypt("PDkZbvCdJQ==\n", "V1xgTs29Ghs=\n"), new String[]{str}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToNext()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(f2440));
                        cursor.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized HashMap m5679(String str, int i) {
        HashMap hashMap;
        Cursor cursor = null;
        try {
            cursor = this.f2443.query(f2442, f2439, StringFog.decrypt("qdEEFQJVzIniiw==\n", "wrR9NU4ch8w=\n"), new String[]{str.replace(GMTDateParser.ANY, '%')}, null, null, null, i <= 0 ? null : Integer.toString(i));
            hashMap = new HashMap();
            while (cursor != null) {
                if (!cursor.moveToNext()) {
                    break;
                }
                try {
                    hashMap.put(cursor.getString(cursor.getColumnIndexOrThrow(f2441)), cursor.getString(cursor.getColumnIndexOrThrow(f2440)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return hashMap;
    }
}
