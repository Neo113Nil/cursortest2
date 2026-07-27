package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class a8 implements v4 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f4109a = new HashSet();
    public final Set b = new HashSet();
    private Uri c;
    private Uri d;
    private int e;
    private int f;

    public static a8 a(t8 t8Var, com.applovin.impl.sdk.l lVar) {
        if (t8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        t8 c = t8Var.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.D);
        if (c == null || !URLUtil.isValidUrl(c.d())) {
            lVar.Q();
            if (!com.applovin.impl.sdk.p.a()) {
                return null;
            }
            lVar.Q().b("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
            return null;
        }
        a8 a8Var = new a8();
        a8Var.c = Uri.parse(c.d());
        t8 b = t8Var.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.H);
        if (b != null && URLUtil.isValidUrl(b.d())) {
            a8Var.d = Uri.parse(b.d());
        }
        String str = (String) t8Var.a().get("width");
        int i = 0;
        int parseInt = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
        String str2 = (String) t8Var.a().get("height");
        if (str2 != null && Integer.parseInt(str2) > 0) {
            i = Integer.parseInt(str2);
        }
        int intValue = ((Integer) lVar.a(c5.g5)).intValue();
        if (parseInt <= 0 || i <= 0) {
            a8Var.f = intValue;
            a8Var.e = intValue;
        } else {
            double d = parseInt / i;
            int min = Math.min(Math.max(parseInt, i), intValue);
            if (parseInt >= i) {
                a8Var.e = min;
                a8Var.f = (int) (min / d);
            } else {
                a8Var.f = min;
                a8Var.e = (int) (min * d);
            }
        }
        return a8Var;
    }

    public Set b() {
        return this.f4109a;
    }

    public Uri c() {
        return this.d;
    }

    public int d() {
        return this.f;
    }

    public Uri e() {
        return this.c;
    }

    public Set f() {
        return this.b;
    }

    public int g() {
        return this.e;
    }

    public String toString() {
        return "VastIndustryIcon{imageUri='" + e() + "', clickUri='" + c() + "', width=" + g() + ", height=" + d() + "}";
    }

    public static ImageView a(Uri uri, Context context, com.applovin.impl.sdk.l lVar) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setVisibility(8);
        ImageViewUtils.setImageUri(imageView, uri, lVar);
        return imageView;
    }

    public static a8 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        e8 a2;
        e8 a3;
        if (jSONObject == null) {
            return null;
        }
        a8 a8Var = new a8();
        String string = JsonUtils.getString(jSONObject, "image_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        a8Var.c = Uri.parse(string);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null && (a3 = e8.a(jSONObject2, lVar)) != null) {
                a8Var.f4109a.add(a3);
            }
        }
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "view_trackers", new JSONArray());
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null);
            if (jSONObject3 != null && (a2 = e8.a(jSONObject3, lVar)) != null) {
                a8Var.b.add(a2);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "click_uri", null);
        a8Var.d = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        a8Var.e = JsonUtils.getInt(jSONObject, "width", 0);
        a8Var.f = JsonUtils.getInt(jSONObject, "height", 0);
        return a8Var;
    }

    @Override // com.applovin.impl.v4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f4109a.iterator();
        while (it.hasNext()) {
            jSONArray.put(((e8) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            jSONArray.put(((e8) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "view_trackers", jSONArray2);
        Uri uri = this.c;
        JsonUtils.putString(jSONObject, "image_uri", uri == null ? null : uri.toString());
        Uri uri2 = this.d;
        JsonUtils.putString(jSONObject, "click_uri", uri2 != null ? uri2.toString() : null);
        JsonUtils.putInt(jSONObject, "width", this.e);
        JsonUtils.putInt(jSONObject, "height", this.f);
        return jSONObject;
    }
}
