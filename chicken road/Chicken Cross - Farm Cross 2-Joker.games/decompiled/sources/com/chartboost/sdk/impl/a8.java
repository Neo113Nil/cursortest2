package com.chartboost.sdk.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a8 extends SQLiteOpenHelper {
    public /* synthetic */ a8(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? "chartboost_exoplayer.db" : str, (i2 & 4) != 0 ? null : cursorFactory, (i2 & 8) != 0 ? 1 : i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(Context context, String name, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, name, cursorFactory, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
