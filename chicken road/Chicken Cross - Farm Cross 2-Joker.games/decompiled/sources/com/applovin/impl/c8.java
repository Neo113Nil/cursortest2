package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class c8 implements v4 {

    /* renamed from: a, reason: collision with root package name */
    private a f4160a;
    private Uri b;
    private String c;

    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private c8() {
    }

    static c8 a(t8 t8Var, c8 c8Var, com.applovin.impl.sdk.l lVar) {
        if (t8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (c8Var == null) {
            try {
                c8Var = new c8();
            } catch (Throwable th) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("VastNonVideoResource", "Error occurred while initializing", th);
                }
                lVar.E().a("VastNonVideoResource", th);
                return null;
            }
        }
        if (c8Var.b == null && !StringUtils.isValidString(c8Var.c)) {
            String a2 = a(t8Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.D);
            if (URLUtil.isValidUrl(a2)) {
                c8Var.b = Uri.parse(a2);
                c8Var.f4160a = a.STATIC;
                return c8Var;
            }
            String a3 = a(t8Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.E);
            if (StringUtils.isValidString(a3)) {
                c8Var.f4160a = a.IFRAME;
                if (URLUtil.isValidUrl(a3)) {
                    c8Var.b = Uri.parse(a3);
                } else {
                    c8Var.c = a3;
                }
                return c8Var;
            }
            String a4 = a(t8Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.F);
            if (StringUtils.isValidString(a4)) {
                c8Var.f4160a = a.HTML;
                if (URLUtil.isValidUrl(a4)) {
                    c8Var.b = Uri.parse(a4);
                } else {
                    c8Var.c = a4;
                }
            }
        }
        return c8Var;
    }

    public String b() {
        return this.c;
    }

    public Uri c() {
        return this.b;
    }

    public a d() {
        return this.f4160a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        if (this.f4160a != c8Var.f4160a) {
            return false;
        }
        Uri uri = this.b;
        if (uri == null ? c8Var.b != null : !uri.equals(c8Var.b)) {
            return false;
        }
        String str = this.c;
        String str2 = c8Var.c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        a aVar = this.f4160a;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.b;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "VastNonVideoResource{type=" + this.f4160a + ", resourceUri=" + this.b + ", resourceContents='" + this.c + "'}";
    }

    private static String a(t8 t8Var, String str) {
        t8 c = t8Var.c(str);
        if (c != null) {
            return c.d();
        }
        return null;
    }

    public void a(Uri uri) {
        this.b = uri;
    }

    public void a(String str) {
        this.c = str;
    }

    public static c8 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "type", null);
        a valueOf = string == null ? null : a.valueOf(string);
        String string2 = JsonUtils.getString(jSONObject, "resource_uri", null);
        Uri parse = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        c8 c8Var = new c8();
        c8Var.f4160a = valueOf;
        c8Var.b = parse;
        c8Var.c = JsonUtils.getString(jSONObject, "resource_contents", null);
        return c8Var;
    }

    @Override // com.applovin.impl.v4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        a aVar = this.f4160a;
        JsonUtils.putString(jSONObject, "type", aVar == null ? null : aVar.toString());
        Uri uri = this.b;
        JsonUtils.putString(jSONObject, "resource_uri", uri != null ? uri.toString() : null);
        JsonUtils.putString(jSONObject, "resource_contents", this.c);
        return jSONObject;
    }
}
