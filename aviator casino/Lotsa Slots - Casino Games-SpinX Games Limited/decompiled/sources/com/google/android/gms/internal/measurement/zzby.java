package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public abstract class zzby extends android.database.sqlite.SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzby(android.content.Context context, java.lang.String str, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, true == str.equals("") ? null : str, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
        int i2 = com.google.android.gms.internal.measurement.zzca.zzb;
        com.google.android.gms.internal.measurement.zzbv.zza();
    }
}
