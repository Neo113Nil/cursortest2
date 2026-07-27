package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.ResultReceiver;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class O6 {

    /* renamed from: a, reason: collision with root package name */
    public final CounterConfigurationReporterType f6350a;

    /* renamed from: b, reason: collision with root package name */
    public final C0809rj f6351b;

    public O6(CounterConfigurationReporterType counterConfigurationReporterType) {
        this(counterConfigurationReporterType, C0878ua.k().w());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:2|3)|(3:63|64|(9:66|(2:69|67)|70|6|7|8|(8:18|74|26|27|(4:30|(5:34|35|(1:37)(1:41)|38|39)|40|28)|44|45|(2:49|50))|59|60))|5|6|7|8|(5:10|12|16|18|74)|59|60|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0059, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final M6 a(SQLiteDatabase sQLiteDatabase, String str, int i3, String str2, boolean z3) {
        Cursor cursor;
        ArrayList<ContentValues> arrayList;
        C0809rj c0809rj;
        C0758pj c0758pj;
        U3 u3;
        Integer num;
        try {
            cursor = sQLiteDatabase.rawQuery("SELECT global_number, type, event_description FROM events WHERE " + str, null);
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        if (cursor != null) {
            try {
            } catch (Throwable th2) {
                th = th2;
                try {
                    Vj vj = AbstractC0861tj.f8372a;
                    vj.getClass();
                    vj.a(new C0887uj("select_rows_to_delete_exception", th));
                    AbstractC0711no.a(cursor);
                    arrayList = null;
                    int i4 = sQLiteDatabase.delete("events", str, null);
                    if (arrayList != null) {
                    }
                    return new M6(arrayList, i4);
                } finally {
                    AbstractC0711no.a(cursor);
                }
            }
            if (cursor.getCount() > 0) {
                arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                    arrayList.add(contentValues);
                }
                int i42 = sQLiteDatabase.delete("events", str, null);
                if (arrayList != null && arrayList.size() != 0 && i42 == arrayList.size() && z3 && str2 != null && (c0809rj = this.f6351b) != null) {
                    CounterConfigurationReporterType counterConfigurationReporterType = this.f6350a;
                    synchronized (c0809rj) {
                        c0758pj = (C0758pj) c0809rj.f8242c.get(str2);
                        if (c0758pj == null) {
                            c0758pj = new C0758pj(str2, c0809rj.f8241b, counterConfigurationReporterType, c0809rj.f8240a);
                            c0809rj.f8242c.put(str2, c0758pj);
                        }
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        for (ContentValues contentValues2 : arrayList) {
                            Integer asInteger = contentValues2.getAsInteger("global_number");
                            Integer asInteger2 = contentValues2.getAsInteger("type");
                            if (asInteger != null && asInteger2 != null) {
                                jSONArray.put(asInteger);
                                EnumC0569ib a3 = EnumC0569ib.a(asInteger2.intValue());
                                if (a3 == null) {
                                    Map map = Uf.f6718a;
                                    num = null;
                                } else {
                                    num = (Integer) Uf.f6720c.get(a3);
                                }
                                jSONArray2.put(num);
                            }
                        }
                        jSONObject.put("global_number", jSONArray).put("event_type", jSONArray2);
                        JSONObject put = new JSONObject().put("details", new JSONObject().put("reason", N6.a(i3)).put("cleared", jSONObject).put("actual_deleted_number", i42));
                        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str2);
                        String jSONObject2 = put.toString();
                        Set set = D9.f5834a;
                        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
                        u3 = new U3(jSONObject2, "", 12290, 0, orCreatePublicLogger);
                    } catch (Throwable unused) {
                        u3 = null;
                    }
                    if (u3 != null && c0758pj.f8093c != null) {
                        try {
                            CounterConfiguration counterConfiguration = new CounterConfiguration(c0758pj.f8091a);
                            counterConfiguration.setReporterType(c0758pj.f8093c);
                            c0758pj.f8094d.f8313a.reportData(1, u3.d(new Kh(new Gf(c0758pj.f8092b, (ResultReceiver) null), counterConfiguration, new I8(new C0915vl(LoggerStorage.getOrCreatePublicLogger(c0758pj.f8091a), "Crash Environment")), null).c()));
                        } catch (Throwable unused2) {
                        }
                    }
                }
                return new M6(arrayList, i42);
            }
        }
        arrayList = null;
        int i422 = sQLiteDatabase.delete("events", str, null);
        if (arrayList != null) {
            CounterConfigurationReporterType counterConfigurationReporterType2 = this.f6350a;
            synchronized (c0809rj) {
            }
        }
        return new M6(arrayList, i422);
    }

    public O6(CounterConfigurationReporterType counterConfigurationReporterType, C0809rj c0809rj) {
        this.f6350a = counterConfigurationReporterType;
        this.f6351b = c0809rj;
    }
}
