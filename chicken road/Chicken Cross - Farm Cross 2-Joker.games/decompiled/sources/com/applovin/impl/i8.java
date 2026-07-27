package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.C4665u;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class i8 implements v4 {

    /* renamed from: a, reason: collision with root package name */
    private Uri f4249a;
    private Uri b;
    private a c;
    private String d;
    private int e;
    private int f;
    private long g;

    public enum a {
        Progressive,
        Streaming
    }

    private i8() {
    }

    public static i8 a(t8 t8Var, com.applovin.impl.sdk.l lVar) {
        if (t8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String d = t8Var.d();
            if (!URLUtil.isValidUrl(d)) {
                lVar.Q();
                if (!com.applovin.impl.sdk.p.a()) {
                    return null;
                }
                lVar.Q().b("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            }
            Uri parse = Uri.parse(d);
            i8 i8Var = new i8();
            i8Var.f4249a = parse;
            i8Var.b = parse;
            i8Var.g = a(t8Var);
            i8Var.c = a((String) t8Var.a().get(C4665u.g));
            i8Var.f = StringUtils.parseInt((String) t8Var.a().get("height"));
            i8Var.e = StringUtils.parseInt((String) t8Var.a().get("width"));
            i8Var.d = ((String) t8Var.a().get("type")).toLowerCase(Locale.ENGLISH);
            return i8Var;
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("VastVideoFile", "Error occurred while initializing", th);
            }
            lVar.E().a("VastVideoFile", th);
            return null;
        }
    }

    public long b() {
        return this.g;
    }

    public String c() {
        return this.d;
    }

    public Uri d() {
        return this.f4249a;
    }

    public Uri e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) obj;
        if (this.e != i8Var.e || this.f != i8Var.f || this.g != i8Var.g) {
            return false;
        }
        Uri uri = this.f4249a;
        if (uri == null ? i8Var.f4249a != null : !uri.equals(i8Var.f4249a)) {
            return false;
        }
        Uri uri2 = this.b;
        if (uri2 == null ? i8Var.b != null : !uri2.equals(i8Var.b)) {
            return false;
        }
        if (this.c != i8Var.c) {
            return false;
        }
        String str = this.d;
        String str2 = i8Var.d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        Uri uri = this.f4249a;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.d;
        return ((((((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.e) * 31) + this.f) * 31) + Long.valueOf(this.g).hashCode();
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f4249a + ", videoUri=" + this.b + ", deliveryType=" + this.c + ", fileType='" + this.d + "', width=" + this.e + ", height=" + this.f + ", bitrate=" + this.g + AbstractJsonLexerKt.END_OBJ;
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    private static long a(t8 t8Var) {
        Map a2 = t8Var.a();
        long parseLong = StringUtils.parseLong((String) a2.get("bitrate"), 0L);
        return parseLong != 0 ? parseLong : (StringUtils.parseLong((String) a2.get("minBitrate"), 0L) + StringUtils.parseLong((String) a2.get("maxBitrate"), 0L)) / 2;
    }

    public void a(Uri uri) {
        this.b = uri;
    }

    public static i8 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "source_video_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Uri parse = Uri.parse(string);
        if (TextUtils.isEmpty(JsonUtils.getString(jSONObject, "video_uri", null))) {
            return null;
        }
        Uri parse2 = Uri.parse(string);
        String string2 = JsonUtils.getString(jSONObject, "file_type", null);
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        a valueOf = a.valueOf(JsonUtils.getString(jSONObject, "delivery_type", a.Progressive.toString()));
        int i = JsonUtils.getInt(jSONObject, "width", 0);
        int i2 = JsonUtils.getInt(jSONObject, "height", 0);
        int i3 = JsonUtils.getInt(jSONObject, "bitrate", 0);
        i8 i8Var = new i8();
        i8Var.f4249a = parse;
        i8Var.b = parse2;
        i8Var.c = valueOf;
        i8Var.d = string2;
        i8Var.e = i;
        i8Var.f = i2;
        i8Var.g = i3;
        return i8Var;
    }

    @Override // com.applovin.impl.v4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        Uri uri = this.f4249a;
        if (uri != null) {
            JsonUtils.putString(jSONObject, "source_video_uri", uri.toString());
        }
        Uri uri2 = this.b;
        if (uri2 != null) {
            JsonUtils.putString(jSONObject, "video_uri", uri2.toString());
        }
        a aVar = this.c;
        JsonUtils.putString(jSONObject, "delivery_type", aVar == null ? null : aVar.toString());
        JsonUtils.putString(jSONObject, "file_type", this.d);
        JsonUtils.putInt(jSONObject, "width", this.e);
        JsonUtils.putInt(jSONObject, "height", this.f);
        JsonUtils.putLong(jSONObject, "bitrate", this.g);
        return jSONObject;
    }
}
