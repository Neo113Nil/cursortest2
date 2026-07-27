package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓽ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0835 extends SQLiteOpenHelper {
    public C0835(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL(StringFog.decrypt("KBhRwj5ISTMXOHXsFGc2Ph0zLco9\n", "eEoQhXMJaVU=\n"));
        }
        sQLiteDatabase.execSQL(StringFog.decrypt("HhfoigxmOa8cB+GOeGpf2xMK+esde1CoCRaNoC58ao8yN8jjM0Zg2wkA9Z94c0uyEAT/knhoXKJx\nZduqNANNvgURhA==\n", "XUWty1gjGfs=\n"));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
