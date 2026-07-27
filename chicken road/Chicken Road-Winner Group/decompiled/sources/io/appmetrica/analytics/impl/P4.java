package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;

/* loaded from: classes.dex */
public final class P4 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final int f6384a = 2000;

    /* renamed from: b, reason: collision with root package name */
    public final String f6385b = "number";

    /* renamed from: c, reason: collision with root package name */
    public final String f6386c = "global_number";

    /* renamed from: d, reason: collision with root package name */
    public final String f6387d = "number_of_type";

    /* renamed from: e, reason: collision with root package name */
    public final String f6388e = "name";
    public final String f = "value";

    /* renamed from: g, reason: collision with root package name */
    public final String f6389g = "type";

    /* renamed from: h, reason: collision with root package name */
    public final String f6390h = "time";

    /* renamed from: i, reason: collision with root package name */
    public final String f6391i = "session_id";

    /* renamed from: j, reason: collision with root package name */
    public final String f6392j = "error_environment";

    /* renamed from: k, reason: collision with root package name */
    public final String f6393k = "session_type";

    /* renamed from: l, reason: collision with root package name */
    public final String f6394l = "app_environment";

    /* renamed from: m, reason: collision with root package name */
    public final String f6395m = "app_environment_revision";

    /* renamed from: n, reason: collision with root package name */
    public final String f6396n = "truncated";

    /* renamed from: o, reason: collision with root package name */
    public final String f6397o = "custom_type";

    /* renamed from: p, reason: collision with root package name */
    public final String f6398p = "encrypting_mode";

    /* renamed from: q, reason: collision with root package name */
    public final String f6399q = "profile_id";

    /* renamed from: r, reason: collision with root package name */
    public final String f6400r = "first_occurrence_status";

    /* renamed from: s, reason: collision with root package name */
    public final String f6401s = AdRevenueConstants.SOURCE_KEY;

    /* renamed from: t, reason: collision with root package name */
    public final String f6402t = "attribution_id_changed";

    /* renamed from: u, reason: collision with root package name */
    public final String f6403u = "open_id";

    /* renamed from: v, reason: collision with root package name */
    public final String f6404v = "extras";

    /* renamed from: w, reason: collision with root package name */
    public final String f6405w = "reports";

    /* renamed from: x, reason: collision with root package name */
    public final C0694n7 f6406x = new C0694n7(null, 1, 0 == true ? 1 : 0);

    public static boolean a(C0668m7 c0668m7) {
        Long l3;
        EnumC0569ib enumC0569ib;
        Long l4;
        Long l5;
        Long l6 = c0668m7.f7842a;
        if (l6 == null || l6.longValue() < 10000000000L || c0668m7.f7843b == null || (l3 = c0668m7.f7844c) == null || l3.longValue() < 0 || (enumC0569ib = c0668m7.f7845d) == null || enumC0569ib == EnumC0569ib.EVENT_TYPE_UNDEFINED || (l4 = c0668m7.f7846e) == null || l4.longValue() < 0 || (l5 = c0668m7.f) == null || l5.longValue() < 0) {
            return false;
        }
        Long l7 = c0668m7.f7847g.f7741d;
        if (l7 != null && l7.longValue() < 0) {
            return false;
        }
        Integer num = c0668m7.f7847g.f7745i;
        return num == null || num.intValue() >= 0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        Cursor cursor2 = null;
        try {
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                cursor = sQLiteDatabase2.query(this.f6405w, null, null, null, null, null, null, String.valueOf(this.f6384a));
                while (cursor.moveToNext()) {
                    try {
                        C0668m7 a3 = a(cursor);
                        if (a3 != null && a(a3)) {
                            try {
                                sQLiteDatabase2.insertOrThrow("events", null, this.f6406x.fromModel(a3));
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor = cursor2;
                            cursor.close();
                        }
                        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f6405w);
                    }
                }
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            sQLiteDatabase2 = sQLiteDatabase;
        }
        cursor.close();
        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f6405w);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:2|3|(2:57|(1:59)(15:60|6|(2:50|(1:52)(2:53|(1:55)(12:56|9|10|11|(2:43|(1:45)(2:46|47))|13|14|15|(2:38|(3:40|18|19))|17|18|19)))|8|9|10|11|(0)|13|14|15|(0)|17|18|19))|5|6|(0)|8|9|10|11|(0)|13|14|15|(0)|17|18|19|(3:(9:21|22|23|24|25|(1:27)(1:33)|28|29|30)|(0)|(5:25|(0)(0)|28|29|30))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x012d, code lost:
    
        if (r32.getInt(r32.getColumnIndexOrThrow(r31.f6402t)) != 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0120, code lost:
    
        r4 = io.appmetrica.analytics.impl.EnumC0851t9.NATIVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        r3 = io.appmetrica.analytics.impl.EnumC0619ka.UNKNOWN;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0150 A[Catch: all -> 0x0167, TryCatch #4 {all -> 0x0167, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0131, B:25:0x0141, B:28:0x0156, B:33:0x0150, B:42:0x0120, B:49:0x0104, B:50:0x00d4, B:53:0x00d9, B:57:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:43:0x00fb, B:46:0x0100), top: B:2:0x0005, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118 A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #2 {all -> 0x0120, blocks: (B:15:0x0107, B:38:0x0118), top: B:14:0x0107, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb A[Catch: all -> 0x0104, TryCatch #3 {all -> 0x0104, blocks: (B:11:0x00ea, B:43:0x00fb, B:46:0x0100), top: B:10:0x00ea, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4 A[Catch: all -> 0x0167, TryCatch #4 {all -> 0x0167, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0131, B:25:0x0141, B:28:0x0156, B:33:0x0150, B:42:0x0120, B:49:0x0104, B:50:0x00d4, B:53:0x00d9, B:57:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:43:0x00fb, B:46:0x0100), top: B:2:0x0005, inners: #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0668m7 a(Cursor cursor) {
        EnumC0372al enumC0372al;
        int i3;
        N8 n8;
        EnumC0851t9 enumC0851t9;
        int i4;
        int i5;
        int i6;
        try {
            Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6391i)));
            int i7 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6393k));
            EnumC0372al enumC0372al2 = EnumC0372al.FOREGROUND;
            boolean z3 = true;
            try {
                if (i7 != 0) {
                    enumC0372al2 = EnumC0372al.BACKGROUND;
                    if (i7 != 1) {
                        enumC0372al = null;
                        Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6385b)));
                        EnumC0569ib a3 = EnumC0569ib.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.f6389g)));
                        Long valueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6386c)));
                        Long valueOf4 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6390h)));
                        Integer valueOf5 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f6397o)));
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f6388e));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f));
                        Long valueOf6 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6387d)));
                        String string3 = cursor.getString(cursor.getColumnIndexOrThrow(this.f6392j));
                        String string4 = cursor.getString(cursor.getColumnIndexOrThrow(this.f6394l));
                        Long valueOf7 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6395m)));
                        Integer valueOf8 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f6396n)));
                        i3 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6398p));
                        N8 n82 = N8.NONE;
                        if (i3 != 0) {
                            n82 = N8.AES_VALUE_ENCRYPTION;
                            if (i3 != 2) {
                                n82 = N8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
                                if (i3 != 1) {
                                    n8 = null;
                                    String string5 = cursor.getString(cursor.getColumnIndexOrThrow(this.f6399q));
                                    i6 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6400r));
                                    EnumC0619ka enumC0619ka = EnumC0619ka.FIRST_OCCURRENCE;
                                    if (i6 != 1) {
                                        enumC0619ka = EnumC0619ka.NON_FIRST_OCCURENCE;
                                        if (i6 != 2) {
                                            EnumC0619ka enumC0619ka2 = EnumC0619ka.UNKNOWN;
                                            enumC0619ka = enumC0619ka2;
                                        }
                                    }
                                    EnumC0619ka enumC0619ka3 = enumC0619ka;
                                    i5 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6401s));
                                    EnumC0851t9 enumC0851t92 = EnumC0851t9.NATIVE;
                                    if (i5 != 0) {
                                        enumC0851t92 = EnumC0851t9.JS;
                                        if (i5 != 1) {
                                            enumC0851t9 = null;
                                        }
                                    }
                                    enumC0851t9 = enumC0851t92;
                                }
                            }
                        }
                        n8 = n82;
                        String string52 = cursor.getString(cursor.getColumnIndexOrThrow(this.f6399q));
                        i6 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6400r));
                        EnumC0619ka enumC0619ka4 = EnumC0619ka.FIRST_OCCURRENCE;
                        if (i6 != 1) {
                        }
                        EnumC0619ka enumC0619ka32 = enumC0619ka4;
                        i5 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6401s));
                        EnumC0851t9 enumC0851t922 = EnumC0851t9.NATIVE;
                        if (i5 != 0) {
                        }
                        enumC0851t9 = enumC0851t922;
                    }
                }
            } catch (Throwable unused) {
            }
            enumC0372al = enumC0372al2;
            Long valueOf22 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6385b)));
            EnumC0569ib a32 = EnumC0569ib.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.f6389g)));
            Long valueOf32 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6386c)));
            Long valueOf42 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6390h)));
            Integer valueOf52 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f6397o)));
            String string6 = cursor.getString(cursor.getColumnIndexOrThrow(this.f6388e));
            String string22 = cursor.getString(cursor.getColumnIndexOrThrow(this.f));
            Long valueOf62 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6387d)));
            String string32 = cursor.getString(cursor.getColumnIndexOrThrow(this.f6392j));
            String string42 = cursor.getString(cursor.getColumnIndexOrThrow(this.f6394l));
            Long valueOf72 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6395m)));
            Integer valueOf82 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f6396n)));
            i3 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6398p));
            N8 n822 = N8.NONE;
            if (i3 != 0) {
            }
            n8 = n822;
            String string522 = cursor.getString(cursor.getColumnIndexOrThrow(this.f6399q));
            i6 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6400r));
            EnumC0619ka enumC0619ka42 = EnumC0619ka.FIRST_OCCURRENCE;
            if (i6 != 1) {
            }
            EnumC0619ka enumC0619ka322 = enumC0619ka42;
            i5 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6401s));
            EnumC0851t9 enumC0851t9222 = EnumC0851t9.NATIVE;
            if (i5 != 0) {
            }
            enumC0851t9 = enumC0851t9222;
            z3 = false;
            Boolean valueOf9 = Boolean.valueOf(z3);
            try {
                i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6403u));
            } catch (Throwable unused2) {
                i4 = -1;
            }
            Integer valueOf10 = Integer.valueOf(i4);
            int columnIndex = cursor.getColumnIndex(this.f6404v);
            return new C0668m7(valueOf, enumC0372al, valueOf22, a32, valueOf32, valueOf42, new C0642l7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, n8, string522, enumC0619ka322, enumC0851t9, valueOf9, valueOf10, columnIndex >= 0 ? null : cursor.getBlob(columnIndex)));
            Integer valueOf102 = Integer.valueOf(i4);
            int columnIndex2 = cursor.getColumnIndex(this.f6404v);
            return new C0668m7(valueOf, enumC0372al, valueOf22, a32, valueOf32, valueOf42, new C0642l7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, n8, string522, enumC0619ka322, enumC0851t9, valueOf9, valueOf102, columnIndex2 >= 0 ? null : cursor.getBlob(columnIndex2)));
        } catch (Throwable unused3) {
            return null;
        }
    }
}
