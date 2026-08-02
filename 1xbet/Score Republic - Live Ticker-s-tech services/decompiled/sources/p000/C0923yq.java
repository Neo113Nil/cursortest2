package p000;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: yq */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0923yq implements ic1, kb1, ou0, e41 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9428j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f9429k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f9430l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f9431m;

    public /* synthetic */ C0923yq(g41 g41Var, Object obj, C0648ra c0648ra, int i) {
        this.f9428j = i;
        this.f9429k = g41Var;
        this.f9431m = obj;
        this.f9430l = c0648ra;
    }

    @Override // p000.e41
    public Object apply(Object obj) {
        Object obj2;
        g41 g41Var;
        String str;
        long jInsert;
        ck0 ck0Var;
        int i = this.f9428j;
        String str2 = "bytes";
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        ck0 ck0Var2 = ck0.f1274m;
        int i6 = 2;
        Object obj3 = null;
        Object obj4 = this.f9431m;
        Object obj5 = this.f9430l;
        int i7 = 0;
        g41 g41Var2 = (g41) this.f9429k;
        switch (i) {
            case 4:
                ArrayList arrayList = (ArrayList) obj4;
                C0648ra c0648ra = (C0648ra) obj5;
                Cursor cursor = (Cursor) obj;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    boolean z = cursor.getInt(7) != 0;
                    C0902y5 c0902y5 = new C0902y5();
                    c0902y5.f9159f = new HashMap();
                    String string = cursor.getString(1);
                    if (string == null) {
                        Object obj6 = obj3;
                        C0270h1.m2192h("Null transportName");
                        return obj6;
                    }
                    c0902y5.f9154a = string;
                    c0902y5.f9157d = Long.valueOf(cursor.getLong(i6));
                    c0902y5.f9158e = Long.valueOf(cursor.getLong(3));
                    if (z) {
                        String string2 = cursor.getString(4);
                        c0902y5.f9156c = new C0596pw(string2 == null ? g41.f2609o : new C0818vw(string2), cursor.getBlob(5));
                        g41Var = g41Var2;
                        str = str2;
                        obj2 = obj3;
                    } else {
                        String string3 = cursor.getString(4);
                        C0818vw c0818vw = string3 == null ? g41.f2609o : new C0818vw(string3);
                        Cursor cursorQuery = g41Var2.m1980a().query("event_payloads", new String[]{str2}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                                obj3 = obj3;
                            }
                            obj2 = obj3;
                            byte[] bArr = new byte[length];
                            int i8 = 0;
                            int length2 = 0;
                            while (i8 < arrayList2.size()) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i8);
                                g41 g41Var3 = g41Var2;
                                String str3 = str2;
                                System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                                length2 += bArr2.length;
                                i8++;
                                g41Var2 = g41Var3;
                                str2 = str3;
                            }
                            g41Var = g41Var2;
                            str = str2;
                            cursorQuery.close();
                            c0902y5.f9156c = new C0596pw(c0818vw, bArr);
                        } catch (Throwable th) {
                            cursorQuery.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        c0902y5.f9155b = Integer.valueOf(cursor.getInt(6));
                    }
                    arrayList.add(new C0316ia(j, c0648ra, c0902y5.m5731k()));
                    obj3 = obj2;
                    g41Var2 = g41Var;
                    str2 = str;
                    i6 = 2;
                }
                return obj3;
            case 5:
                C0869x9 c0869x9 = (C0869x9) obj4;
                C0596pw c0596pw = c0869x9.f8868c;
                String str4 = c0869x9.f8866a;
                C0648ra c0648ra2 = (C0648ra) obj5;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = g41Var2.m1980a().compileStatement("PRAGMA page_size").simpleQueryForLong() * g41Var2.m1980a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C0906y9 c0906y9 = g41Var2.f2613m;
                if (jSimpleQueryForLong >= c0906y9.f9222a) {
                    g41Var2.m1983l(1L, ck0Var2, str4);
                    return -1L;
                }
                Long lM1977e = g41.m1977e(sQLiteDatabase, c0648ra2);
                if (lM1977e != null) {
                    jInsert = lM1977e.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", c0648ra2.f6760a);
                    contentValues.put("priority", Integer.valueOf(gx0.m2162a(c0648ra2.f6762c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr3 = c0648ra2.f6761b;
                    if (bArr3 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr3, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i9 = c0906y9.f9226e;
                byte[] bArr4 = c0596pw.f6275b;
                boolean z2 = bArr4.length <= i9;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str4);
                contentValues2.put("timestamp_ms", Long.valueOf(c0869x9.f8869d));
                contentValues2.put("uptime_ms", Long.valueOf(c0869x9.f8870e));
                contentValues2.put("payload_encoding", c0596pw.f6274a.f8276a);
                contentValues2.put("code", c0869x9.f8867b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z2));
                contentValues2.put("payload", z2 ? bArr4 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z2) {
                    int iCeil = (int) Math.ceil(((double) bArr4.length) / ((double) i9));
                    for (int i10 = 1; i10 <= iCeil; i10++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, (i10 - 1) * i9, Math.min(i10 * i9, bArr4.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i10));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(c0869x9.f8871f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            default:
                HashMap map = (HashMap) obj5;
                f71 f71Var = (f71) obj4;
                ArrayList arrayList3 = (ArrayList) f71Var.f2336m;
                Cursor cursor2 = (Cursor) obj;
                g41Var2.getClass();
                while (cursor2.moveToNext()) {
                    String string4 = cursor2.getString(i7);
                    int i11 = cursor2.getInt(1);
                    ck0 ck0Var3 = ck0.f1272k;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            ck0Var3 = ck0.f1273l;
                        } else if (i11 == 2) {
                            ck0Var = ck0Var2;
                        } else if (i11 == i5) {
                            ck0Var3 = ck0.f1275n;
                        } else if (i11 == i4) {
                            ck0Var3 = ck0.f1276o;
                        } else if (i11 == i3) {
                            ck0Var3 = ck0.f1277p;
                        } else if (i11 == i2) {
                            ck0Var3 = ck0.f1278q;
                        } else {
                            o80.m3648j("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i11));
                        }
                        ck0Var = ck0Var3;
                    } else {
                        ck0Var = ck0Var3;
                    }
                    long j2 = cursor2.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new dk0(j2, ck0Var));
                    i2 = 6;
                    i3 = 5;
                    i4 = 4;
                    i5 = 3;
                    i7 = 0;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i12 = gk0.f2791c;
                    new ArrayList();
                    arrayList3.add(new gk0((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long jMo159g = g41Var2.f2611k.mo159g();
                SQLiteDatabase sQLiteDatabaseM1980a = g41Var2.m1980a();
                sQLiteDatabaseM1980a.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseM1980a.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        ld1 ld1Var = new ld1(cursorRawQuery.getLong(0), jMo159g);
                        cursorRawQuery.close();
                        sQLiteDatabaseM1980a.setTransactionSuccessful();
                        sQLiteDatabaseM1980a.endTransaction();
                        f71Var.f2335l = ld1Var;
                        f71Var.f2337n = new c90(new pa1(g41Var2.m1980a().compileStatement("PRAGMA page_size").simpleQueryForLong() * g41Var2.m1980a().compileStatement("PRAGMA page_count").simpleQueryForLong(), C0906y9.f9221f.f9222a));
                        f71Var.f2334k = (String) g41Var2.f2614n.get();
                        return new C0396kh((ld1) f71Var.f2335l, Collections.unmodifiableList(arrayList3), (c90) f71Var.f2337n, (String) f71Var.f2334k);
                    } catch (Throwable th2) {
                        cursorRawQuery.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    sQLiteDatabaseM1980a.endTransaction();
                    throw th3;
                }
        }
    }

    @Override // p000.ou0
    /* JADX INFO: renamed from: b */
    public void mo306b(Object obj) {
        int i = this.f9428j;
        Object obj2 = this.f9431m;
        Object obj3 = this.f9430l;
        aq0 aq0Var = (aq0) this.f9429k;
        zc0 zc0Var = (zc0) obj3;
        switch (i) {
            case 2:
                C0468mf c0468mf = aq0Var.f598a;
                b11 b11Var = (b11) aq0.f596h.get((f10) obj2);
                C0467me c0467meM462a = aq0Var.m462a(zc0Var, (String) obj);
                c0467meM462a.m3637c();
                C0504ne.m3525q((C0504ne) c0467meM462a.f5645k, b11Var);
                c0468mf.m3379d(((C0504ne) c0467meM462a.m3635a()).m2755b());
                break;
            default:
                C0468mf c0468mf2 = aq0Var.f598a;
                EnumC0667rt enumC0667rt = (EnumC0667rt) aq0.f597i.get((e10) obj2);
                C0467me c0467meM462a2 = aq0Var.m462a(zc0Var, (String) obj);
                c0467meM462a2.m3637c();
                C0504ne.m3524p((C0504ne) c0467meM462a2.f5645k, enumC0667rt);
                c0468mf2.m3379d(((C0504ne) c0467meM462a2.m3635a()).m2755b());
                break;
        }
    }

    @Override // p000.ic1
    /* JADX INFO: renamed from: c */
    public Object mo1085c() {
        C0035ar c0035ar = (C0035ar) this.f9429k;
        C0648ra c0648ra = (C0648ra) this.f9430l;
        C0869x9 c0869x9 = (C0869x9) this.f9431m;
        g41 g41Var = c0035ar.f611d;
        g41Var.getClass();
        dx0 dx0Var = c0648ra.f6762c;
        String str = c0869x9.f8866a;
        String str2 = c0648ra.f6760a;
        String strConcat = "TRuntime.".concat("SQLiteEventStore");
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, "Storing event with priority=" + dx0Var + ", name=" + str + " for destination " + str2);
        }
        ((Long) g41Var.m1981i(new C0923yq(g41Var, (Object) c0869x9, c0648ra, 5))).getClass();
        c0035ar.f608a.m4086x(c0648ra, 1, false);
        return null;
    }

    @Override // p000.kb1
    /* JADX INFO: renamed from: k */
    public v92 mo3002k(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f9429k;
        String str = (String) this.f9430l;
        qa1 qa1Var = (qa1) this.f9431m;
        String str2 = (String) obj;
        an0 an0VarM1007c = FirebaseMessaging.m1007c(firebaseMessaging.f1387b);
        w00 w00Var = firebaseMessaging.f1386a;
        w00Var.m5224a();
        String strM5225c = "[DEFAULT]".equals(w00Var.f8319b) ? "" : w00Var.m5225c();
        String strM3401g = firebaseMessaging.f1393h.m3401g();
        synchronized (an0VarM1007c) {
            String strM4043a = qa1.m4043a(System.currentTimeMillis(), str2, strM3401g);
            if (strM4043a != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) an0VarM1007c.f254k).edit();
                editorEdit.putString(strM5225c + "|T|" + str + "|*", strM4043a);
                editorEdit.commit();
            }
        }
        if (qa1Var == null || !str2.equals(qa1Var.f6443a)) {
            w00 w00Var2 = firebaseMessaging.f1386a;
            w00Var2.m5224a();
            if ("[DEFAULT]".equals(w00Var2.f8319b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    w00Var2.m5224a();
                    sb.append(w00Var2.f8319b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new C0312i6(firebaseMessaging.f1387b).m2550v(intent);
            }
        }
        return hn0.m2316j(str2);
    }

    public /* synthetic */ C0923yq(Object obj, Object obj2, Object obj3, int i) {
        this.f9428j = i;
        this.f9429k = obj;
        this.f9430l = obj2;
        this.f9431m = obj3;
    }
}
