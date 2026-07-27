package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.ResultReceiver;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
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
    public final CounterConfigurationReporterType f7209a;

    /* renamed from: b, reason: collision with root package name */
    public final C0958rj f7210b;

    public O6(CounterConfigurationReporterType counterConfigurationReporterType) {
        this(counterConfigurationReporterType, C1027ua.k().w());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|2|3|(2:5|6)|(3:65|66|(9:68|(2:71|69)|72|9|10|11|(8:21|79|29|30|(4:33|(5:37|38|(1:40)(1:44)|41|42)|43|31)|47|48|(2:52|53))|61|62))|8|9|10|11|(5:13|15|19|21|79)|61|62|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x005e, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final M6 a(SQLiteDatabase sQLiteDatabase, String str, int i2, String str2, boolean z) {
        Throwable th;
        Cursor cursor;
        ArrayList<ContentValues> arrayList;
        C0958rj c0958rj;
        C0907pj c0907pj;
        U3 u32;
        Integer num;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            cursor = sQLiteDatabase.rawQuery("SELECT global_number, type, event_description FROM events WHERE " + str, null);
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            try {
                Vj vj = AbstractC1010tj.f9323a;
                vj.getClass();
                vj.a(new C1036uj("select_rows_to_delete_exception", th));
                AbstractC0860no.a(cursor);
                arrayList = null;
                int i3 = sQLiteDatabase.delete("events", str, null);
                if (arrayList != null) {
                }
                return new M6(arrayList, i3);
            } finally {
                AbstractC0860no.a(cursor);
            }
        }
        if (cursor != null) {
            try {
            } catch (Throwable th4) {
                th = th4;
                Vj vj2 = AbstractC1010tj.f9323a;
                vj2.getClass();
                vj2.a(new C1036uj("select_rows_to_delete_exception", th));
                AbstractC0860no.a(cursor);
                arrayList = null;
                int i32 = sQLiteDatabase.delete("events", str, null);
                if (arrayList != null) {
                }
                return new M6(arrayList, i32);
            }
            if (cursor.getCount() > 0) {
                arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                    arrayList.add(contentValues);
                }
                int i322 = sQLiteDatabase.delete("events", str, null);
                if (arrayList != null && arrayList.size() != 0 && i322 == arrayList.size() && z && str2 != null && (c0958rj = this.f7210b) != null) {
                    CounterConfigurationReporterType counterConfigurationReporterType = this.f7209a;
                    synchronized (c0958rj) {
                        c0907pj = (C0907pj) c0958rj.f9186c.get(str2);
                        if (c0907pj == null) {
                            c0907pj = new C0907pj(str2, c0958rj.f9185b, counterConfigurationReporterType, c0958rj.f9184a);
                            c0958rj.f9186c.put(str2, c0907pj);
                        }
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        for (ContentValues contentValues2 : arrayList) {
                            Integer asInteger = contentValues2.getAsInteger("global_number");
                            Integer asInteger2 = contentValues2.getAsInteger(WebViewManager.EVENT_TYPE_KEY);
                            if (asInteger != null && asInteger2 != null) {
                                jSONArray.put(asInteger);
                                EnumC0718ib a6 = EnumC0718ib.a(asInteger2.intValue());
                                if (a6 == null) {
                                    Map map = Uf.f7591a;
                                    num = null;
                                } else {
                                    num = (Integer) Uf.f7593c.get(a6);
                                }
                                jSONArray2.put(num);
                            }
                        }
                        jSONObject.put("global_number", jSONArray).put("event_type", jSONArray2);
                        JSONObject put = new JSONObject().put("details", new JSONObject().put("reason", N6.a(i2)).put("cleared", jSONObject).put("actual_deleted_number", i322));
                        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str2);
                        String jSONObject2 = put.toString();
                        Set set = D9.f6670a;
                        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
                        u32 = new U3(jSONObject2, "", 12290, 0, orCreatePublicLogger);
                    } catch (Throwable unused) {
                        u32 = null;
                    }
                    if (u32 != null && c0907pj.f9030c != null) {
                        try {
                            CounterConfiguration counterConfiguration = new CounterConfiguration(c0907pj.f9028a);
                            counterConfiguration.setReporterType(c0907pj.f9030c);
                            c0907pj.f9031d.f9261a.reportData(1, u32.d(new Kh(new Gf(c0907pj.f9029b, (ResultReceiver) null), counterConfiguration, new I8(new C1064vl(LoggerStorage.getOrCreatePublicLogger(c0907pj.f9028a), "Crash Environment")), null).c()));
                        } catch (Throwable unused2) {
                        }
                    }
                }
                return new M6(arrayList, i322);
            }
        }
        arrayList = null;
        int i3222 = sQLiteDatabase.delete("events", str, null);
        if (arrayList != null) {
            CounterConfigurationReporterType counterConfigurationReporterType2 = this.f7209a;
            synchronized (c0958rj) {
            }
        }
        return new M6(arrayList, i3222);
    }

    public O6(CounterConfigurationReporterType counterConfigurationReporterType, C0958rj c0958rj) {
        this.f7209a = counterConfigurationReporterType;
        this.f7210b = c0958rj;
    }
}
