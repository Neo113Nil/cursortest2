package sg.bigo.ads.d0;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.b0.AbstractC5025b;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.x1.q;
import sg.bigo.ads.x1.s;

/* loaded from: classes3.dex */
public abstract class b {
    public static ContentValues a(s sVar) {
        String str;
        String str2;
        String str3;
        String str4;
        ContentValues contentValues = new ContentValues();
        Map map = sVar.g;
        String str5 = "";
        if (map != null) {
            if (map instanceof HashMap) {
                map.remove(null);
                map.values().removeAll(Collections.singleton(null));
            }
            str = new JSONObject(sVar.g).toString();
        } else {
            str = "";
        }
        contentValues.put("ad_data", str);
        if (sVar.r != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = sVar.r.iterator();
            while (it.hasNext()) {
                jSONArray.put(((q) it.next()).m);
            }
            str2 = jSONArray.toString();
        } else {
            str2 = "";
        }
        contentValues.put("tracker_imp", str2);
        if (sVar.s != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = sVar.s.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((q) it2.next()).m);
            }
            str3 = jSONArray2.toString();
        } else {
            str3 = "";
        }
        contentValues.put("tracker_cli", str3);
        if (sVar.t != null) {
            JSONArray jSONArray3 = new JSONArray();
            Iterator it3 = sVar.t.iterator();
            while (it3.hasNext()) {
                jSONArray3.put(((q) it3.next()).m);
            }
            str4 = jSONArray3.toString();
        } else {
            str4 = "";
        }
        contentValues.put("tracker_nurl", str4);
        if (sVar.u != null) {
            JSONArray jSONArray4 = new JSONArray();
            Iterator it4 = sVar.u.iterator();
            while (it4.hasNext()) {
                jSONArray4.put(((q) it4.next()).m);
            }
            str5 = jSONArray4.toString();
        }
        contentValues.put("tracker_lurl", str5);
        contentValues.put("last_retry_ts", Long.valueOf(Math.max(Math.max(sVar.i, sVar.k), sVar.c)));
        contentValues.put("ext", sVar.d);
        long j = sVar.e;
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        contentValues.put("ctime", Long.valueOf(j));
        long j2 = sVar.f;
        if (j2 == 0) {
            j2 = System.currentTimeMillis();
        }
        contentValues.put("mtime", Long.valueOf(j2));
        return contentValues;
    }

    public static void b(s sVar) {
        sVar.toString();
        sVar.f = System.currentTimeMillis();
        String str = new String[]{"_id"}[0] + "=? ";
        ContentValues a2 = a(sVar);
        String[] strArr = {String.valueOf(sVar.f13403a)};
        AbstractC5025b.a();
        SQLiteDatabase sQLiteDatabase = AbstractC5025b.c;
        if (sQLiteDatabase == null) {
            return;
        }
        try {
            sQLiteDatabase.update("tb_tracker", a2, str, strArr);
        } catch (SQLException unused) {
            AbstractC5496a.a("DbHelper", "Failed: " + a2);
        }
    }
}
