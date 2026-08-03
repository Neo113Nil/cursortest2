package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class H6 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.internal.CounterConfigurationReporterType f4371a;

    public H6(io.appmetrica.analytics.internal.CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f4371a = counterConfigurationReporterType;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|2|3|(2:5|6)|(3:65|66|(9:68|(2:71|69)|72|9|10|11|(2:18|(8:21|7b|29|30|(4:33|(5:37|38|(1:40)(1:44)|41|42)|43|31)|47|48|(2:52|53)))|61|62))|8|9|10|11|(4:13|15|18|(2:21|7b))|61|62|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x005e, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.appmetrica.analytics.impl.F6 a(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str, int i2, java.lang.String str2, boolean z2) {
        java.lang.Throwable th;
        android.database.Cursor cursor;
        java.util.ArrayList<android.content.ContentValues> arrayList;
        io.appmetrica.analytics.impl.C0543mj c0543mj;
        io.appmetrica.analytics.impl.C0491kj c0491kj;
        io.appmetrica.analytics.impl.M3 m3;
        java.lang.Integer num;
        try {
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        try {
            cursor = sQLiteDatabase.rawQuery("SELECT global_number, type, event_description FROM events WHERE " + str, null);
        } catch (java.lang.Throwable th3) {
            th = th3;
            cursor = null;
            try {
                io.appmetrica.analytics.impl.Qj qj = io.appmetrica.analytics.impl.AbstractC0595oj.f6598a;
                qj.getClass();
                qj.a(new io.appmetrica.analytics.impl.C0621pj("select_rows_to_delete_exception", th));
                io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor);
                arrayList = null;
                int i3 = sQLiteDatabase.delete("events", str, null);
                if (arrayList != null) {
                }
                return new io.appmetrica.analytics.impl.F6(arrayList, i3);
            } finally {
                io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor);
            }
        }
        if (cursor != null) {
            try {
            } catch (java.lang.Throwable th4) {
                th = th4;
                io.appmetrica.analytics.impl.Qj qj2 = io.appmetrica.analytics.impl.AbstractC0595oj.f6598a;
                qj2.getClass();
                qj2.a(new io.appmetrica.analytics.impl.C0621pj("select_rows_to_delete_exception", th));
                io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor);
                arrayList = null;
                int i32 = sQLiteDatabase.delete("events", str, null);
                if (arrayList != null) {
                }
                return new io.appmetrica.analytics.impl.F6(arrayList, i32);
            }
            if (cursor.getCount() > 0) {
                arrayList = new java.util.ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    android.database.DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                    arrayList.add(contentValues);
                }
                int i322 = sQLiteDatabase.delete("events", str, null);
                if (arrayList != null && arrayList.size() != 0 && i322 == arrayList.size() && z2) {
                    c0543mj = io.appmetrica.analytics.impl.C0560na.f6484I.f6497f;
                    if (str2 != null && c0543mj != null) {
                        io.appmetrica.analytics.internal.CounterConfigurationReporterType counterConfigurationReporterType = this.f4371a;
                        synchronized (c0543mj) {
                            c0491kj = (io.appmetrica.analytics.impl.C0491kj) c0543mj.f6441c.get(str2);
                            if (c0491kj == null) {
                                c0491kj = new io.appmetrica.analytics.impl.C0491kj(str2, c0543mj.f6440b, counterConfigurationReporterType, c0543mj.f6439a);
                                c0543mj.f6441c.put(str2, c0491kj);
                            }
                        }
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            org.json.JSONArray jSONArray = new org.json.JSONArray();
                            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                            for (android.content.ContentValues contentValues2 : arrayList) {
                                java.lang.Integer asInteger = contentValues2.getAsInteger("global_number");
                                java.lang.Integer asInteger2 = contentValues2.getAsInteger("type");
                                if (asInteger != null && asInteger2 != null) {
                                    jSONArray.put(asInteger);
                                    io.appmetrica.analytics.impl.EnumC0251bb a2 = io.appmetrica.analytics.impl.EnumC0251bb.a(asInteger2.intValue());
                                    if (a2 == null) {
                                        java.util.Map map = io.appmetrica.analytics.impl.Pf.f4838a;
                                        num = null;
                                    } else {
                                        num = (java.lang.Integer) io.appmetrica.analytics.impl.Pf.f4840c.get(a2);
                                    }
                                    jSONArray2.put(num);
                                }
                            }
                            jSONObject.put("global_number", jSONArray).put("event_type", jSONArray2);
                            org.json.JSONObject put = new org.json.JSONObject().put("details", new org.json.JSONObject().put("reason", io.appmetrica.analytics.impl.G6.a(i2)).put("cleared", jSONObject).put("actual_deleted_number", i322));
                            io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger orCreatePublicLogger = io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getOrCreatePublicLogger(str2);
                            java.lang.String jSONObject2 = put.toString();
                            java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
                            io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
                            m3 = new io.appmetrica.analytics.impl.M3(jSONObject2, "", 12290, 0, orCreatePublicLogger);
                        } catch (java.lang.Throwable unused) {
                            m3 = null;
                        }
                        if (m3 != null && c0491kj.f6306c != null) {
                            try {
                                io.appmetrica.analytics.internal.CounterConfiguration counterConfiguration = new io.appmetrica.analytics.internal.CounterConfiguration(c0491kj.f6304a);
                                counterConfiguration.setReporterType(c0491kj.f6306c);
                                ((io.appmetrica.analytics.impl.B1) c0491kj.f6307d.f6538a).reportData(1, m3.d(new io.appmetrica.analytics.impl.Fh(new io.appmetrica.analytics.impl.Bf(c0491kj.f6305b, (android.os.ResultReceiver) null), counterConfiguration, new io.appmetrica.analytics.impl.D8(new io.appmetrica.analytics.impl.C0674rl(io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getOrCreatePublicLogger(c0491kj.f6304a), "Crash Environment")), null).c()));
                            } catch (java.lang.Throwable unused2) {
                            }
                        }
                    }
                }
                return new io.appmetrica.analytics.impl.F6(arrayList, i322);
            }
        }
        arrayList = null;
        int i3222 = sQLiteDatabase.delete("events", str, null);
        if (arrayList != null) {
            c0543mj = io.appmetrica.analytics.impl.C0560na.f6484I.f6497f;
            if (str2 != null) {
                io.appmetrica.analytics.internal.CounterConfigurationReporterType counterConfigurationReporterType2 = this.f4371a;
                synchronized (c0543mj) {
                }
            }
        }
        return new io.appmetrica.analytics.impl.F6(arrayList, i3222);
    }
}
