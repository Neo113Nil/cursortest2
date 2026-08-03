package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class I4 extends io.appmetrica.analytics.coreapi.internal.db.DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final int f4416a = 2000;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f4417b = "number";

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f4418c = "global_number";

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f4419d = "number_of_type";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f4420e = "name";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f4421f = "value";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f4422g = "type";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f4423h = "time";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f4424i = "session_id";

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f4425j = "error_environment";

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f4426k = "session_type";

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f4427l = "app_environment";

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f4428m = "app_environment_revision";

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f4429n = "truncated";

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f4430o = "custom_type";

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f4431p = "encrypting_mode";

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f4432q = "profile_id";

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f4433r = "first_occurrence_status";

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f4434s = io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.SOURCE_KEY;
    public final java.lang.String t = "attribution_id_changed";

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f4435u = "open_id";

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f4436v = "extras";

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f4437w = "reports";

    /* renamed from: x, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0350f7 f4438x = new io.appmetrica.analytics.impl.C0350f7(null, 1, 0 == true ? 1 : 0);

    public static boolean a(io.appmetrica.analytics.impl.C0324e7 c0324e7) {
        java.lang.Long l2;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb;
        java.lang.Long l3;
        java.lang.Long l4;
        java.lang.Long l5;
        java.lang.Integer num;
        java.lang.Long l6 = c0324e7.f5777a;
        return (l6 == null || l6.longValue() < 10000000000L || c0324e7.f5778b == null || (l2 = c0324e7.f5779c) == null || l2.longValue() < 0 || (enumC0251bb = c0324e7.f5780d) == null || enumC0251bb == io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED || (l3 = c0324e7.f5781e) == null || l3.longValue() < 0 || (l4 = c0324e7.f5782f) == null || l4.longValue() < 0 || ((l5 = c0324e7.f5783g.f5700d) != null && l5.longValue() < 0) || ((num = c0324e7.f5783g.f5705i) != null && num.intValue() < 0)) ? false : true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        android.database.Cursor cursor;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        android.database.Cursor cursor2 = null;
        try {
            cursor = sQLiteDatabase.query(this.f4437w, null, null, null, null, null, null, java.lang.String.valueOf(this.f4416a));
            while (cursor.moveToNext()) {
                try {
                    io.appmetrica.analytics.impl.C0324e7 a2 = a(cursor);
                    if (a2 != null && a(a2)) {
                        try {
                            sQLiteDatabase.insertOrThrow("events", null, this.f4438x.fromModel(a2));
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                } catch (java.lang.Throwable unused2) {
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor = cursor2;
                        cursor.close();
                    }
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f4437w);
                }
            }
        } catch (java.lang.Throwable unused3) {
        }
        cursor.close();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f4437w);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:2|3|(3:(2:58|(1:60)(15:61|6|(2:51|(1:53)(2:54|(1:56)(12:57|9|10|11|(2:44|(1:46)(8:47|48|14|15|(2:38|(3:40|18|19))|17|18|19))|13|14|15|(0)|17|18|19)))|8|9|10|11|(0)|13|14|15|(0)|17|18|19))|18|19)|5|6|(0)|8|9|10|11|(0)|13|14|15|(0)|17|(3:(0)|(9:21|22|23|24|25|(1:27)(1:33)|28|29|30)|(5:25|(0)(0)|28|29|30))) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:2|3|(2:58|(1:60)(15:61|6|(2:51|(1:53)(2:54|(1:56)(12:57|9|10|11|(2:44|(1:46)(8:47|48|14|15|(2:38|(3:40|18|19))|17|18|19))|13|14|15|(0)|17|18|19)))|8|9|10|11|(0)|13|14|15|(0)|17|18|19))|5|6|(0)|8|9|10|11|(0)|13|14|15|(0)|17|18|19|(3:(0)|(9:21|22|23|24|25|(1:27)(1:33)|28|29|30)|(5:25|(0)(0)|28|29|30))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x012e, code lost:
    
        if (r32.getInt(r32.getColumnIndexOrThrow(r31.t)) == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
    
        r27 = io.appmetrica.analytics.impl.EnumC0533m9.NATIVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0103, code lost:
    
        r3 = io.appmetrica.analytics.impl.EnumC0302da.UNKNOWN;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0151 A[Catch: all -> 0x016b, TryCatch #4 {all -> 0x016b, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0132, B:25:0x0142, B:28:0x0157, B:33:0x0151, B:42:0x0120, B:50:0x0103, B:51:0x00d4, B:54:0x00d9, B:58:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:44:0x00fb, B:47:0x0100), top: B:2:0x0005, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118 A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #0 {all -> 0x0120, blocks: (B:15:0x0107, B:38:0x0118), top: B:14:0x0107, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb A[Catch: all -> 0x0103, TryCatch #3 {all -> 0x0103, blocks: (B:11:0x00ea, B:44:0x00fb, B:47:0x0100), top: B:10:0x00ea, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4 A[Catch: all -> 0x016b, TryCatch #4 {all -> 0x016b, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0132, B:25:0x0142, B:28:0x0157, B:33:0x0151, B:42:0x0120, B:50:0x0103, B:51:0x00d4, B:54:0x00d9, B:58:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:44:0x00fb, B:47:0x0100), top: B:2:0x0005, inners: #0, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.appmetrica.analytics.impl.C0324e7 a(android.database.Cursor cursor) {
        io.appmetrica.analytics.impl.Vk vk;
        int i2;
        io.appmetrica.analytics.impl.I8 i8;
        io.appmetrica.analytics.impl.EnumC0302da enumC0302da;
        io.appmetrica.analytics.impl.EnumC0533m9 enumC0533m9;
        int i3;
        int i4;
        int i5;
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4424i)));
            int i6 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4426k));
            io.appmetrica.analytics.impl.Vk vk2 = io.appmetrica.analytics.impl.Vk.FOREGROUND;
            boolean z2 = true;
            try {
                if (i6 != 0) {
                    vk2 = io.appmetrica.analytics.impl.Vk.BACKGROUND;
                    if (i6 != 1) {
                        vk = null;
                        java.lang.Long valueOf2 = java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4417b)));
                        io.appmetrica.analytics.impl.EnumC0251bb a2 = io.appmetrica.analytics.impl.EnumC0251bb.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.f4422g)));
                        java.lang.Long valueOf3 = java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4418c)));
                        java.lang.Long valueOf4 = java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4423h)));
                        java.lang.Integer valueOf5 = java.lang.Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f4430o)));
                        java.lang.String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f4420e));
                        java.lang.String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f4421f));
                        java.lang.Long valueOf6 = java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4419d)));
                        java.lang.String string3 = cursor.getString(cursor.getColumnIndexOrThrow(this.f4425j));
                        java.lang.String string4 = cursor.getString(cursor.getColumnIndexOrThrow(this.f4427l));
                        java.lang.Long valueOf7 = java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4428m)));
                        java.lang.Integer valueOf8 = java.lang.Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f4429n)));
                        i2 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4431p));
                        io.appmetrica.analytics.impl.I8 i82 = io.appmetrica.analytics.impl.I8.NONE;
                        if (i2 != 0) {
                            i82 = io.appmetrica.analytics.impl.I8.AES_VALUE_ENCRYPTION;
                            if (i2 != 2) {
                                i82 = io.appmetrica.analytics.impl.I8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
                                if (i2 != 1) {
                                    i8 = null;
                                    java.lang.String string5 = cursor.getString(cursor.getColumnIndexOrThrow(this.f4432q));
                                    i5 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4433r));
                                    io.appmetrica.analytics.impl.EnumC0302da enumC0302da2 = io.appmetrica.analytics.impl.EnumC0302da.FIRST_OCCURRENCE;
                                    if (i5 != 1) {
                                        enumC0302da2 = io.appmetrica.analytics.impl.EnumC0302da.NON_FIRST_OCCURENCE;
                                        if (i5 != 2) {
                                            io.appmetrica.analytics.impl.EnumC0302da enumC0302da3 = io.appmetrica.analytics.impl.EnumC0302da.UNKNOWN;
                                            enumC0302da = enumC0302da3;
                                            i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4434s));
                                            io.appmetrica.analytics.impl.EnumC0533m9 enumC0533m92 = io.appmetrica.analytics.impl.EnumC0533m9.NATIVE;
                                            if (i4 != 0) {
                                                enumC0533m92 = io.appmetrica.analytics.impl.EnumC0533m9.JS;
                                                if (i4 != 1) {
                                                    enumC0533m9 = null;
                                                }
                                            }
                                            enumC0533m9 = enumC0533m92;
                                        }
                                    }
                                    enumC0302da = enumC0302da2;
                                    i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4434s));
                                    io.appmetrica.analytics.impl.EnumC0533m9 enumC0533m922 = io.appmetrica.analytics.impl.EnumC0533m9.NATIVE;
                                    if (i4 != 0) {
                                    }
                                    enumC0533m9 = enumC0533m922;
                                }
                            }
                        }
                        i8 = i82;
                        java.lang.String string52 = cursor.getString(cursor.getColumnIndexOrThrow(this.f4432q));
                        i5 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4433r));
                        io.appmetrica.analytics.impl.EnumC0302da enumC0302da22 = io.appmetrica.analytics.impl.EnumC0302da.FIRST_OCCURRENCE;
                        if (i5 != 1) {
                        }
                        enumC0302da = enumC0302da22;
                        i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4434s));
                        io.appmetrica.analytics.impl.EnumC0533m9 enumC0533m9222 = io.appmetrica.analytics.impl.EnumC0533m9.NATIVE;
                        if (i4 != 0) {
                        }
                        enumC0533m9 = enumC0533m9222;
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
            vk = vk2;
            java.lang.Long valueOf22 = java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4417b)));
            io.appmetrica.analytics.impl.EnumC0251bb a22 = io.appmetrica.analytics.impl.EnumC0251bb.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.f4422g)));
            java.lang.Long valueOf32 = java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4418c)));
            java.lang.Long valueOf42 = java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4423h)));
            java.lang.Integer valueOf52 = java.lang.Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f4430o)));
            java.lang.String string6 = cursor.getString(cursor.getColumnIndexOrThrow(this.f4420e));
            java.lang.String string22 = cursor.getString(cursor.getColumnIndexOrThrow(this.f4421f));
            java.lang.Long valueOf62 = java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4419d)));
            java.lang.String string32 = cursor.getString(cursor.getColumnIndexOrThrow(this.f4425j));
            java.lang.String string42 = cursor.getString(cursor.getColumnIndexOrThrow(this.f4427l));
            java.lang.Long valueOf72 = java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4428m)));
            java.lang.Integer valueOf82 = java.lang.Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f4429n)));
            i2 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4431p));
            io.appmetrica.analytics.impl.I8 i822 = io.appmetrica.analytics.impl.I8.NONE;
            if (i2 != 0) {
            }
            i8 = i822;
            java.lang.String string522 = cursor.getString(cursor.getColumnIndexOrThrow(this.f4432q));
            i5 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4433r));
            io.appmetrica.analytics.impl.EnumC0302da enumC0302da222 = io.appmetrica.analytics.impl.EnumC0302da.FIRST_OCCURRENCE;
            if (i5 != 1) {
            }
            enumC0302da = enumC0302da222;
            i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4434s));
            io.appmetrica.analytics.impl.EnumC0533m9 enumC0533m92222 = io.appmetrica.analytics.impl.EnumC0533m9.NATIVE;
            if (i4 != 0) {
            }
            enumC0533m9 = enumC0533m92222;
            z2 = false;
            java.lang.Boolean valueOf9 = java.lang.Boolean.valueOf(z2);
            try {
                i3 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4435u));
            } catch (java.lang.Throwable unused2) {
                i3 = -1;
            }
            java.lang.Integer valueOf10 = java.lang.Integer.valueOf(i3);
            int columnIndex = cursor.getColumnIndex(this.f4436v);
            return new io.appmetrica.analytics.impl.C0324e7(valueOf, vk, valueOf22, a22, valueOf32, valueOf42, new io.appmetrica.analytics.impl.C0299d7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, i8, string522, enumC0302da, enumC0533m9, valueOf9, valueOf10, columnIndex >= 0 ? null : cursor.getBlob(columnIndex)));
            java.lang.Integer valueOf102 = java.lang.Integer.valueOf(i3);
            int columnIndex2 = cursor.getColumnIndex(this.f4436v);
            return new io.appmetrica.analytics.impl.C0324e7(valueOf, vk, valueOf22, a22, valueOf32, valueOf42, new io.appmetrica.analytics.impl.C0299d7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, i8, string522, enumC0302da, enumC0533m9, valueOf9, valueOf102, columnIndex2 >= 0 ? null : cursor.getBlob(columnIndex2)));
        } catch (java.lang.Throwable unused3) {
            return null;
        }
    }
}
