package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C4531m8;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.ca, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4354ca {
    private static final String b = "ca";
    private static final String c = "supersonic_shared_preferen";
    private static final String d = "version";
    private static final String e = "back_button_state";
    private static final String f = "search_keys";
    private static final String g = "^\\d+_\\d+$";
    private static C4354ca h;

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f8114a;

    private C4354ca(Context context) {
        this.f8114a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    public static synchronized C4354ca a(Context context) {
        C4354ca c4354ca;
        synchronized (C4354ca.class) {
            if (h == null) {
                h = new C4354ca(context);
            }
            c4354ca = h;
        }
        return c4354ca;
    }

    public static synchronized C4354ca e() {
        C4354ca c4354ca;
        synchronized (C4354ca.class) {
            c4354ca = h;
        }
        return c4354ca;
    }

    public C4531m8.a b() {
        int parseInt = Integer.parseInt(this.f8114a.getString(e, "2"));
        return parseInt == 0 ? C4531m8.a.None : parseInt == 1 ? C4531m8.a.Device : parseInt == 2 ? C4531m8.a.Controller : C4531m8.a.Controller;
    }

    public void c(String str) {
        SharedPreferences.Editor edit = this.f8114a.edit();
        edit.putString(e, str);
        edit.apply();
    }

    public List<String> d() {
        String string = this.f8114a.getString(f, null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            C4448he c4448he = new C4448he(string);
            if (c4448he.a(U3.i.R)) {
                try {
                    arrayList.addAll(c4448he.a((JSONArray) c4448he.b(U3.i.R)));
                } catch (JSONException e2) {
                    C4491k4.d().a(e2);
                    IronLog.INTERNAL.error(e2.toString());
                }
            }
        }
        return arrayList;
    }

    public void e(String str) {
        SharedPreferences.Editor edit = this.f8114a.edit();
        edit.putString(f, str);
        edit.apply();
    }

    public void a(String str, String str2) {
        SharedPreferences.Editor edit = this.f8114a.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public String c() {
        return this.f8114a.getString("version", Y1.f);
    }

    public String a(String str) {
        String string = this.f8114a.getString(str, null);
        return string != null ? string : JsonUtils.EMPTY_JSON;
    }

    private boolean b(String str) {
        return str.matches(g);
    }

    public boolean a(String str, String str2, String str3) {
        String string = this.f8114a.getString("ssaUserData", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2.isNull(str3)) {
                return false;
            }
            jSONObject2.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor edit = this.f8114a.edit();
            edit.putString("ssaUserData", jSONObject.toString());
            edit.apply();
            return true;
        } catch (JSONException e2) {
            C4491k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }

    public void d(String str) {
        if (c().equalsIgnoreCase(str)) {
            return;
        }
        SharedPreferences.Editor edit = this.f8114a.edit();
        edit.putString("version", str);
        edit.apply();
    }

    public ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = (String[]) this.f8114a.getAll().keySet().toArray(new String[0]);
        SharedPreferences.Editor edit = this.f8114a.edit();
        for (String str : strArr) {
            if (b(str)) {
                arrayList.add(str);
                edit.remove(str);
            }
        }
        edit.apply();
        return arrayList;
    }
}
