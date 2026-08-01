package sg.bigo.ads.x1;

import android.content.Context;
import android.database.Cursor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.O;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public long f13403a;
    public final boolean b;
    public final long c;
    public final String d;
    public final long e;
    public long f;
    public final Map g;
    public int h;
    public long i;
    public int j;
    public long k;
    public int l;
    public long m;
    public int n;
    public long o;
    public final sg.bigo.ads.P.u p;
    public int q;
    public CopyOnWriteArrayList r;
    public CopyOnWriteArrayList s;
    public CopyOnWriteArrayList t;
    public CopyOnWriteArrayList u;

    public s(sg.bigo.ads.P.u uVar, Cursor cursor) {
        this.f13403a = -1L;
        this.b = false;
        this.c = 0L;
        this.d = "";
        this.f13403a = cursor.getLong(cursor.getColumnIndex("_id"));
        try {
            JSONObject jSONObject = new JSONObject(cursor.getString(cursor.getColumnIndex("ad_data")));
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            this.g = hashMap;
        } catch (JSONException unused) {
        }
        String string = cursor.getString(cursor.getColumnIndex("tracker_imp"));
        if (!I.a((CharSequence) string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                this.r = new CopyOnWriteArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.r.add(new q(jSONArray.getJSONObject(i), null));
                }
            } catch (JSONException unused2) {
            }
        }
        String string2 = cursor.getString(cursor.getColumnIndex("tracker_cli"));
        if (!I.a((CharSequence) string2)) {
            try {
                JSONArray jSONArray2 = new JSONArray(string2);
                this.s = new CopyOnWriteArrayList();
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    this.s.add(new q(jSONArray2.getJSONObject(i2), null));
                }
            } catch (JSONException unused3) {
            }
        }
        String string3 = cursor.getString(cursor.getColumnIndex("tracker_nurl"));
        if (!I.a((CharSequence) string3)) {
            try {
                JSONArray jSONArray3 = new JSONArray(string3);
                this.t = new CopyOnWriteArrayList();
                for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                    this.t.add(new q(jSONArray3.getJSONObject(i3), null));
                }
            } catch (JSONException unused4) {
            }
        }
        String string4 = cursor.getString(cursor.getColumnIndex("tracker_lurl"));
        if (!I.a((CharSequence) string4)) {
            try {
                JSONArray jSONArray4 = new JSONArray(string4);
                this.u = new CopyOnWriteArrayList();
                for (int i4 = 0; i4 < jSONArray4.length(); i4++) {
                    this.u.add(new q(jSONArray4.getJSONObject(i4), null));
                }
            } catch (JSONException unused5) {
            }
        }
        cursor.getInt(cursor.getColumnIndex("tracker_type"));
        this.c = cursor.getLong(cursor.getColumnIndex("last_retry_ts"));
        this.d = cursor.getString(cursor.getColumnIndex("ext"));
        this.e = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.f = cursor.getLong(cursor.getColumnIndex("mtime"));
        this.b = true;
        this.h = 0;
        this.i = 0L;
        this.j = 0;
        this.k = 0L;
        this.l = 0;
        this.m = 0L;
        this.n = 0;
        this.o = 0L;
        this.p = uVar;
    }

    public final boolean a(CopyOnWriteArrayList copyOnWriteArrayList, int i) {
        return copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0 || i >= this.p.c;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != s.class) {
            return false;
        }
        long j = this.f13403a;
        return j >= 0 && j == ((s) obj).f13403a;
    }

    public final String toString() {
        return "mId = " + this.f13403a;
    }

    public final void a(Context context, String str, q qVar) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        String str2 = qVar.c;
        if (qVar.h != 0 && O.b() / 1000 > qVar.h) {
            if ("impl_track".equals(str)) {
                copyOnWriteArrayList = this.r;
            } else if ("click_track".equals(str)) {
                copyOnWriteArrayList = this.s;
            } else if ("nurl_track".equals(str)) {
                copyOnWriteArrayList = this.t;
            } else if (!"lurl_track".equals(str)) {
                return;
            } else {
                copyOnWriteArrayList = this.u;
            }
            copyOnWriteArrayList.remove(qVar);
            return;
        }
        int i = this.h;
        if ("click_track".equals(str)) {
            i = this.j;
        } else if ("nurl_track".equals(str)) {
            i = this.l;
        } else if ("lurl_track".equals(str)) {
            i = this.n;
        }
        int i2 = i;
        sg.bigo.ads.w1.a a2 = qVar.a();
        int i3 = qVar.i;
        boolean z = qVar.k;
        "bigo_tracker".equals(qVar.d);
        sg.bigo.ads.w1.d.a(context, i3, str, a2, str2, z, this.q, this.b, i2, this.g, new r(this, str, qVar));
    }

    public s(sg.bigo.ads.P.u uVar, HashMap hashMap) {
        this.f13403a = -1L;
        this.b = false;
        this.c = 0L;
        this.d = "";
        long currentTimeMillis = System.currentTimeMillis();
        this.g = hashMap;
        this.e = currentTimeMillis;
        this.f = currentTimeMillis;
        this.h = 0;
        this.i = 0L;
        this.j = 0;
        this.k = 0L;
        this.l = 0;
        this.m = 0L;
        this.n = 0;
        this.o = 0L;
        this.p = uVar;
    }
}
