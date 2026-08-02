package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qa1 {

    /* JADX INFO: renamed from: a */
    public final String f6443a;

    /* JADX INFO: renamed from: b */
    public long f6444b;

    /* JADX INFO: renamed from: c */
    public final Object f6445c;

    public qa1(qt1 qt1Var, String str, long j) {
        this.f6445c = qt1Var;
        p80.m3860e(str);
        this.f6443a = str;
        this.f6444b = qt1Var.m4173X("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    /* JADX INFO: renamed from: a */
    public static String m4043a(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static qa1 m4044b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new qa1(0L, str, (String) null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new qa1(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public List m4045c() {
        List list;
        List list2;
        qt1 qt1Var = (qt1) this.f6445c;
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(this.f6444b);
        String str = this.f6443a;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = qt1Var.m4191r0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{str, strValueOf}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(3);
                        boolean z = cursorQuery.getLong(5) == 1;
                        long j3 = cursorQuery.getLong(6);
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.f6444b) {
                            this.f6444b = j;
                        }
                        try {
                            qz1 qz1Var = (qz1) a72.m58l0(rz1.m4439J(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            qz1Var.m4215n(string);
                            long j4 = cursorQuery.getLong(2);
                            qz1Var.m5681b();
                            ((rz1) qz1Var.f9011k).m4455Q(j4);
                            qz1Var.m5681b();
                            ((rz1) qz1Var.f9011k).m4459t(j3);
                            arrayList.add(new mt1(j, j2, z, (rz1) qz1Var.m5683d()));
                        } catch (IOException e) {
                            ky1 ky1Var = ((f02) qt1Var.f7192j).f2247o;
                            f02.m1560m(ky1Var);
                            ky1Var.f4600o.m5314c(ky1.m3106I(str), e, "Data loss. Failed to merge raw event. appId");
                        }
                    } while (cursorQuery.moveToNext());
                    list = arrayList;
                } else {
                    list2 = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e2) {
                ky1 ky1Var2 = ((f02) qt1Var.f7192j).f2247o;
                f02.m1560m(ky1Var2);
                ky1Var2.f4600o.m5314c(ky1.m3106I(str), e2, "Data loss. Error querying raw events batch. appId");
                list = arrayList;
            }
            list = list2;
            return list;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public qa1(qt1 qt1Var, String str) {
        this.f6445c = qt1Var;
        p80.m3860e(str);
        this.f6443a = str;
        this.f6444b = -1L;
    }

    public qa1(long j, String str, String str2) {
        this.f6443a = str;
        this.f6445c = str2;
        this.f6444b = j;
    }
}
