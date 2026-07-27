package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.session.internal.influence.impl.InfluenceConstants;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;

/* loaded from: classes.dex */
public final class P4 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final int f7240a = 2000;

    /* renamed from: b, reason: collision with root package name */
    public final String f7241b = "number";

    /* renamed from: c, reason: collision with root package name */
    public final String f7242c = "global_number";

    /* renamed from: d, reason: collision with root package name */
    public final String f7243d = "number_of_type";

    /* renamed from: e, reason: collision with root package name */
    public final String f7244e = "name";

    /* renamed from: f, reason: collision with root package name */
    public final String f7245f = "value";

    /* renamed from: g, reason: collision with root package name */
    public final String f7246g = WebViewManager.EVENT_TYPE_KEY;

    /* renamed from: h, reason: collision with root package name */
    public final String f7247h = InfluenceConstants.TIME;

    /* renamed from: i, reason: collision with root package name */
    public final String f7248i = "session_id";

    /* renamed from: j, reason: collision with root package name */
    public final String f7249j = "error_environment";

    /* renamed from: k, reason: collision with root package name */
    public final String f7250k = "session_type";

    /* renamed from: l, reason: collision with root package name */
    public final String f7251l = "app_environment";

    /* renamed from: m, reason: collision with root package name */
    public final String f7252m = "app_environment_revision";

    /* renamed from: n, reason: collision with root package name */
    public final String f7253n = "truncated";

    /* renamed from: o, reason: collision with root package name */
    public final String f7254o = "custom_type";

    /* renamed from: p, reason: collision with root package name */
    public final String f7255p = "encrypting_mode";

    /* renamed from: q, reason: collision with root package name */
    public final String f7256q = "profile_id";

    /* renamed from: r, reason: collision with root package name */
    public final String f7257r = "first_occurrence_status";

    /* renamed from: s, reason: collision with root package name */
    public final String f7258s = AdRevenueConstants.SOURCE_KEY;

    /* renamed from: t, reason: collision with root package name */
    public final String f7259t = "attribution_id_changed";

    /* renamed from: u, reason: collision with root package name */
    public final String f7260u = "open_id";

    /* renamed from: v, reason: collision with root package name */
    public final String f7261v = "extras";

    /* renamed from: w, reason: collision with root package name */
    public final String f7262w = "reports";

    /* renamed from: x, reason: collision with root package name */
    public final C0843n7 f7263x = new C0843n7(null, 1, 0 == true ? 1 : 0);

    public static boolean a(C0817m7 c0817m7) {
        Long l2;
        EnumC0718ib enumC0718ib;
        Long l6;
        Long l7;
        Long l8;
        Integer num;
        Long l9 = c0817m7.f8767a;
        return (l9 == null || l9.longValue() < 10000000000L || c0817m7.f8768b == null || (l2 = c0817m7.f8769c) == null || l2.longValue() < 0 || (enumC0718ib = c0817m7.f8770d) == null || enumC0718ib == EnumC0718ib.EVENT_TYPE_UNDEFINED || (l6 = c0817m7.f8771e) == null || l6.longValue() < 0 || (l7 = c0817m7.f8772f) == null || l7.longValue() < 0 || ((l8 = c0817m7.f8773g.f8662d) != null && l8.longValue() < 0) || ((num = c0817m7.f8773g.f8667i) != null && num.intValue() < 0)) ? false : true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        Cursor cursor2 = null;
        try {
            cursor = sQLiteDatabase.query(this.f7262w, null, null, null, null, null, null, String.valueOf(this.f7240a));
            while (cursor.moveToNext()) {
                try {
                    C0817m7 a6 = a(cursor);
                    if (a6 != null && a(a6)) {
                        try {
                            sQLiteDatabase.insertOrThrow("events", null, this.f7263x.fromModel(a6));
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor = cursor2;
                        cursor.close();
                    }
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f7262w);
                }
            }
        } catch (Throwable unused3) {
        }
        cursor.close();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f7262w);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:2|3|(3:(2:58|(1:60)(15:61|6|(2:51|(1:53)(2:54|(1:56)(12:57|9|10|11|(2:44|(1:46)(8:47|48|14|15|(2:38|(3:40|18|19))|17|18|19))|13|14|15|(0)|17|18|19)))|8|9|10|11|(0)|13|14|15|(0)|17|18|19))|18|19)|5|6|(0)|8|9|10|11|(0)|13|14|15|(0)|17|(3:(0)|(9:21|22|23|24|25|(1:27)(1:33)|28|29|30)|(5:25|(0)(0)|28|29|30))) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:2|3|(2:58|(1:60)(15:61|6|(2:51|(1:53)(2:54|(1:56)(12:57|9|10|11|(2:44|(1:46)(8:47|48|14|15|(2:38|(3:40|18|19))|17|18|19))|13|14|15|(0)|17|18|19)))|8|9|10|11|(0)|13|14|15|(0)|17|18|19))|5|6|(0)|8|9|10|11|(0)|13|14|15|(0)|17|18|19|(3:(0)|(9:21|22|23|24|25|(1:27)(1:33)|28|29|30)|(5:25|(0)(0)|28|29|30))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x012e, code lost:
    
        if (r32.getInt(r32.getColumnIndexOrThrow(r31.f7259t)) == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
    
        r27 = io.appmetrica.analytics.impl.EnumC1000t9.NATIVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0103, code lost:
    
        r3 = io.appmetrica.analytics.impl.EnumC0768ka.UNKNOWN;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0151 A[Catch: all -> 0x016b, TryCatch #4 {all -> 0x016b, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0132, B:25:0x0142, B:28:0x0157, B:33:0x0151, B:42:0x0120, B:50:0x0103, B:51:0x00d4, B:54:0x00d9, B:58:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:44:0x00fb, B:47:0x0100), top: B:2:0x0005, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118 A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #0 {all -> 0x0120, blocks: (B:15:0x0107, B:38:0x0118), top: B:14:0x0107, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb A[Catch: all -> 0x0103, TryCatch #3 {all -> 0x0103, blocks: (B:11:0x00ea, B:44:0x00fb, B:47:0x0100), top: B:10:0x00ea, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4 A[Catch: all -> 0x016b, TryCatch #4 {all -> 0x016b, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0132, B:25:0x0142, B:28:0x0157, B:33:0x0151, B:42:0x0120, B:50:0x0103, B:51:0x00d4, B:54:0x00d9, B:58:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:44:0x00fb, B:47:0x0100), top: B:2:0x0005, inners: #0, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0817m7 a(Cursor cursor) {
        EnumC0521al enumC0521al;
        int i2;
        N8 n8;
        EnumC0768ka enumC0768ka;
        EnumC1000t9 enumC1000t9;
        int i3;
        int i6;
        int i7;
        try {
            Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7248i)));
            int i8 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f7250k));
            EnumC0521al enumC0521al2 = EnumC0521al.FOREGROUND;
            boolean z = true;
            try {
                if (i8 != 0) {
                    enumC0521al2 = EnumC0521al.BACKGROUND;
                    if (i8 != 1) {
                        enumC0521al = null;
                        Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7241b)));
                        EnumC0718ib a6 = EnumC0718ib.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.f7246g)));
                        Long valueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7242c)));
                        Long valueOf4 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7247h)));
                        Integer valueOf5 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f7254o)));
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f7244e));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f7245f));
                        Long valueOf6 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7243d)));
                        String string3 = cursor.getString(cursor.getColumnIndexOrThrow(this.f7249j));
                        String string4 = cursor.getString(cursor.getColumnIndexOrThrow(this.f7251l));
                        Long valueOf7 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7252m)));
                        Integer valueOf8 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f7253n)));
                        i2 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f7255p));
                        N8 n82 = N8.NONE;
                        if (i2 != 0) {
                            n82 = N8.AES_VALUE_ENCRYPTION;
                            if (i2 != 2) {
                                n82 = N8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
                                if (i2 != 1) {
                                    n8 = null;
                                    String string5 = cursor.getString(cursor.getColumnIndexOrThrow(this.f7256q));
                                    i7 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f7257r));
                                    EnumC0768ka enumC0768ka2 = EnumC0768ka.FIRST_OCCURRENCE;
                                    if (i7 != 1) {
                                        enumC0768ka2 = EnumC0768ka.NON_FIRST_OCCURENCE;
                                        if (i7 != 2) {
                                            EnumC0768ka enumC0768ka3 = EnumC0768ka.UNKNOWN;
                                            enumC0768ka = enumC0768ka3;
                                            i6 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f7258s));
                                            EnumC1000t9 enumC1000t92 = EnumC1000t9.NATIVE;
                                            if (i6 != 0) {
                                                enumC1000t92 = EnumC1000t9.JS;
                                                if (i6 != 1) {
                                                    enumC1000t9 = null;
                                                }
                                            }
                                            enumC1000t9 = enumC1000t92;
                                        }
                                    }
                                    enumC0768ka = enumC0768ka2;
                                    i6 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f7258s));
                                    EnumC1000t9 enumC1000t922 = EnumC1000t9.NATIVE;
                                    if (i6 != 0) {
                                    }
                                    enumC1000t9 = enumC1000t922;
                                }
                            }
                        }
                        n8 = n82;
                        String string52 = cursor.getString(cursor.getColumnIndexOrThrow(this.f7256q));
                        i7 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f7257r));
                        EnumC0768ka enumC0768ka22 = EnumC0768ka.FIRST_OCCURRENCE;
                        if (i7 != 1) {
                        }
                        enumC0768ka = enumC0768ka22;
                        i6 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f7258s));
                        EnumC1000t9 enumC1000t9222 = EnumC1000t9.NATIVE;
                        if (i6 != 0) {
                        }
                        enumC1000t9 = enumC1000t9222;
                    }
                }
            } catch (Throwable unused) {
            }
            enumC0521al = enumC0521al2;
            Long valueOf22 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7241b)));
            EnumC0718ib a62 = EnumC0718ib.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.f7246g)));
            Long valueOf32 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7242c)));
            Long valueOf42 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7247h)));
            Integer valueOf52 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f7254o)));
            String string6 = cursor.getString(cursor.getColumnIndexOrThrow(this.f7244e));
            String string22 = cursor.getString(cursor.getColumnIndexOrThrow(this.f7245f));
            Long valueOf62 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7243d)));
            String string32 = cursor.getString(cursor.getColumnIndexOrThrow(this.f7249j));
            String string42 = cursor.getString(cursor.getColumnIndexOrThrow(this.f7251l));
            Long valueOf72 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7252m)));
            Integer valueOf82 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f7253n)));
            i2 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f7255p));
            N8 n822 = N8.NONE;
            if (i2 != 0) {
            }
            n8 = n822;
            String string522 = cursor.getString(cursor.getColumnIndexOrThrow(this.f7256q));
            i7 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f7257r));
            EnumC0768ka enumC0768ka222 = EnumC0768ka.FIRST_OCCURRENCE;
            if (i7 != 1) {
            }
            enumC0768ka = enumC0768ka222;
            i6 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f7258s));
            EnumC1000t9 enumC1000t92222 = EnumC1000t9.NATIVE;
            if (i6 != 0) {
            }
            enumC1000t9 = enumC1000t92222;
            z = false;
            Boolean valueOf9 = Boolean.valueOf(z);
            try {
                i3 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f7260u));
            } catch (Throwable unused2) {
                i3 = -1;
            }
            Integer valueOf10 = Integer.valueOf(i3);
            int columnIndex = cursor.getColumnIndex(this.f7261v);
            return new C0817m7(valueOf, enumC0521al, valueOf22, a62, valueOf32, valueOf42, new C0791l7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, n8, string522, enumC0768ka, enumC1000t9, valueOf9, valueOf10, columnIndex >= 0 ? null : cursor.getBlob(columnIndex)));
            Integer valueOf102 = Integer.valueOf(i3);
            int columnIndex2 = cursor.getColumnIndex(this.f7261v);
            return new C0817m7(valueOf, enumC0521al, valueOf22, a62, valueOf32, valueOf42, new C0791l7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, n8, string522, enumC0768ka, enumC1000t9, valueOf9, valueOf102, columnIndex2 >= 0 ? null : cursor.getBlob(columnIndex2)));
        } catch (Throwable unused3) {
            return null;
        }
    }
}
